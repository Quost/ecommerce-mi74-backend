package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Carrinho")
@Data
public class Carrinho {
    @Id
    @GeneratedValue
    private int id;
    private int quantidade;
    private double precoTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    @ManyToOne
    private Comprador comprador;
}
