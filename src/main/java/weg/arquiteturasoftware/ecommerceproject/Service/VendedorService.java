package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Entity.Vendedor;
import weg.arquiteturasoftware.ecommerceproject.Repository.ProdutoRepository;
import weg.arquiteturasoftware.ecommerceproject.Repository.VendedorRepository;

@Service
public class VendedorService {

    @Autowired
    ProdutoRepository produtoRepository;

}

