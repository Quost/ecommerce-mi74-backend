package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
}
