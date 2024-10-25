package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Estoque;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Repository.EstoqueRepository;

@Service
public class EstoqueService {

    @Autowired
    EstoqueRepository estoqueRepository;


    public int consultarQuantidadeProduto(int produtoId) {
        Estoque estoque = estoqueRepository.findByProdutoId(produtoId);
        return estoque != null ? estoque.getQuantidade() : 0;
    }

    public List<Produto> listarProdutosNoEstoque() {
        return produtoRepository.findAll();
    }

    public boolean verificarDisponibilidadeProduto(int produtoId, int quantidadeDesejada) {
        int quantidadeDisponivel = consultarQuantidadeProduto(produtoId);
        return quantidadeDisponivel >= quantidadeDesejada;
    }

    public Estoque registrarEntradaProduto(int produtoId, int quantidadeEntrada) {
        Estoque estoque = estoqueRepository.findByProdutoId(produtoId);
        if (estoque != null) {
            int novaQuantidade = estoque.getQuantidade() + quantidadeEntrada;
            estoque.setQuantidade(novaQuantidade);
            return estoqueRepository.save(estoque);
        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado no estoque");
    }

    // 8. Registrar Saída  Produto do Estoque
    public Estoque registrarSaidaProduto(int produtoId, int quantidadeSaida) {
        Estoque estoque = estoqueRepository.findByProdutoId(produtoId);
        if (estoque != null && estoque.getQuantidade() >= quantidadeSaida) {
            int novaQuantidade = estoque.getQuantidade() - quantidadeSaida;
            estoque.setQuantidade(novaQuantidade);
            return estoqueRepository.save(estoque);
        }
        throw new ProdutoNaoEncontradoException("Quantidade insuficiente ou produto não encontrado no estoque");
    }
}