package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name = "Vendedor")
public class Vendedor {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private long cnpj;
}
