package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Carrinho;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Exception.CarrinhoInvalidoException;
import weg.arquiteturasoftware.ecommerceproject.Repository.CarrinhoRepository;
import weg.arquiteturasoftware.ecommerceproject.Repository.ProdutoRepository;
import java.util.List;

import java.util.Optional;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public void limparCarrinho(Carrinho carrinho) {
        carrinho.setQuantidade(0);
        carrinho.setPrecoTotal(0.0);
        carrinhoRepository.save(carrinho);
    }

    public double calcularPrecoTotal(Carrinho carrinho) {
        return carrinho.getPrecoTotal();
    }

    public List<Produto> listarProdutosNoCarrinho(int carrinhoId) {
        Optional<Carrinho> carrinhoOpt = carrinhoRepository.findById(carrinhoId);
        return carrinhoOpt.map(Carrinho::getProdutos).orElseThrow(() -> new CarrinhoInvalidoException("Carrinho não encontrado"));
    }
}
