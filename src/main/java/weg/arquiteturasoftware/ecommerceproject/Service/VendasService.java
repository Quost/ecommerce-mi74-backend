package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Repository.ProdutoRepository;
import weg.arquiteturasoftware.ecommerceproject.Repository.VendasRepository;

@Service
public class VendasService {

    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    VendasRepository vendasRepository;

    public Produto adicionarProdutoAVendidos(Produto produto) {
        return produtoRepository.save(produto);
    }
}
