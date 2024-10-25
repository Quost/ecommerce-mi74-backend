package weg.arquiteturasoftware.ecommerceproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weg.arquiteturasoftware.ecommerceproject.Entity.Comprador;
import weg.arquiteturasoftware.ecommerceproject.Entity.Vendedor;

public interface CompradorRepository extends JpaRepository<Comprador, Integer> {
}
