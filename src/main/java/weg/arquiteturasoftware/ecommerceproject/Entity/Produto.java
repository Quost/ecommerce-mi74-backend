package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table(name ="Produto")
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private int id;

    private String categoria;
    private String nome;
    private double custo;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "estoque_id")
    private Estoque estoque;

}
