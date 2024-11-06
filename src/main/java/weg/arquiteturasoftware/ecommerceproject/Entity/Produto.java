package weg.arquiteturasoftware.ecommerceproject.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table(name ="Produto")
@Entity
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoria;
    private String nome;
    private double custo;
    private String descricao;

    @ManyToOne(cascade = CascadeType.REMOVE) // Define a exclusão em cascata
    @JoinColumn(name = "estoque_id", referencedColumnName = "id")
    private Estoque estoque;

}
