package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Comprador;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Entity.Vendedor;
import weg.arquiteturasoftware.ecommerceproject.Exception.ProdutoNaoEncontradoException;
import weg.arquiteturasoftware.ecommerceproject.Repository.CarrinhoRepository;
import weg.arquiteturasoftware.ecommerceproject.Repository.CompradorRepository;
import weg.arquiteturasoftware.ecommerceproject.Repository.ProdutoRepository;

@Service
public class CompradorService {

    @Autowired
    CompradorRepository compradorRepository;
    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    ProdutoService produtoService;

    public Produto adicionarProdutoAoCarrinho (Produto produto) {
        return produtoRepository.save(produto);
    }

    public void removerProdutoCarrinho(Produto produto) {
         produtoRepository.delete(produto);
    }

    public void finalizarCompra (Produto produto, int id) {

        try {

            produtoService.buscarProduto(id);

        } catch (ProdutoNaoEncontradoException e ) {
            throw new  RuntimeException ("Produto não encontrado");
        }
    }
}
