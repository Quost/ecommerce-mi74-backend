package weg.arquiteturasoftware.ecommerceproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weg.arquiteturasoftware.ecommerceproject.Entity.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Integer> {
}
