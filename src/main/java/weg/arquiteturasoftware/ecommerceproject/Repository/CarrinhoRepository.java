package weg.arquiteturasoftware.ecommerceproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weg.arquiteturasoftware.ecommerceproject.Entity.Carrinho;

public interface CarrinhoRepository extends JpaRepository <Carrinho, Integer> {
}
