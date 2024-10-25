package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Repository.EstoqueRepository;

@Service
public class EstoqueService {

    @Autowired
    EstoqueRepository estoqueRepository;
}
