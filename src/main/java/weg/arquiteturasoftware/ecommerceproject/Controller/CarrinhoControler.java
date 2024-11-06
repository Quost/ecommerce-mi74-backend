package weg.arquiteturasoftware.ecommerceproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weg.arquiteturasoftware.ecommerceproject.Service.CarrinhoService;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoControler {

    @Autowired
    CarrinhoService carrinhoService;

    @GetMapping("/listar")
    public void listarProdutosCarrinho() {
        carrinhoService.listarTodosProdutosNoCarrinho();
    }
}
