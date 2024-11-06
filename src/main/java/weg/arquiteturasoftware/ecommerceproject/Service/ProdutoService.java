package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Estoque;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Exception.ProdutoInvalidoException;
import weg.arquiteturasoftware.ecommerceproject.Exception.ProdutoNaoEncontradoException;
import weg.arquiteturasoftware.ecommerceproject.Repository.EstoqueRepository;
import weg.arquiteturasoftware.ecommerceproject.Repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    EstoqueRepository estoqueRepository;

    public Produto criarProduto(Produto produto, Integer estoqueId) {
        Estoque estoque = estoqueRepository.findById(estoqueId).orElseThrow(() -> new RuntimeException("Estoque não encontrado"));
        produto.setEstoque(estoque);
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Produto produto) {
        produtoRepository.delete(produto);
    }

    public Produto buscarProduto(int id){
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (produto == null){
            throw new ProdutoInvalidoException("Produto não encontrado");
        } else {
            return produto;
        }
    }

    public List<Produto> buscarTodosProdutos(){
        return produtoRepository.findAll();
    }

    public void atualizarProduto(int id, Produto produtoNovo){
        Produto produtoAntigo = buscarProduto(id);
        produtoAntigo.setNome(produtoNovo.getNome());
        produtoAntigo.setDescricao(produtoNovo.getDescricao());
        produtoAntigo.setCusto(produtoNovo.getCusto());
        produtoRepository.save(produtoAntigo);
    }

}
