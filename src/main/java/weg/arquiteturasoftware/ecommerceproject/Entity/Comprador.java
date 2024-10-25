package weg.arquiteturasoftware.ecommerceproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table ( name = "Comprador")
public class Comprador {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private long cpf;
}
