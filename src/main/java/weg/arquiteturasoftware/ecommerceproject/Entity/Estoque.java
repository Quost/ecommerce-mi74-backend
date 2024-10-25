package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Table ( name = "Estoque")
@Entity
public class Estoque {
    @Id
    @GeneratedValue
    private int id;
    private int quantidade;

    //private Produto produto;
}
