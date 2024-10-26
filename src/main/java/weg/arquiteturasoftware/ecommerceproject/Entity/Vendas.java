package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table( name = "Vendas")
@Entity
public class Vendas {

    @Id
    @GeneratedValue
    private int id;
    //private Comprador comprador;
    //private Produto produto;

}
