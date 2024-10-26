package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Table ( name = "Estoque")
@Entity
public class Estoque {
    @Id
    @GeneratedValue
    private int id;

    private int quantidade;

    @OneToMany(mappedBy = "estoque")
    private List<Produto> produtos;
}
