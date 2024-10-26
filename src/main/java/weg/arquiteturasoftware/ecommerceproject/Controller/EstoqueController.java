package weg.arquiteturasoftware.ecommerceproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weg.arquiteturasoftware.ecommerceproject.Entity.Estoque;
import weg.arquiteturasoftware.ecommerceproject.Service.EstoqueService;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    EstoqueService estoqueService;

    @PostMapping("/adicionar")
    public Estoque criarEstoque(Estoque estoque) {
        return estoqueService.criarEstoque(estoque);
    }

    @GetMapping("/listar")
    public Estoque buscarEstoques(int id) {
        return estoqueService.buscarEstoque(id);
    }
}
