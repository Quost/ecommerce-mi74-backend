package weg.arquiteturasoftware.ecommerceproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import weg.arquiteturasoftware.ecommerceproject.Entity.Estoque;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Service.EstoqueService;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    EstoqueService estoqueService;

    @PostMapping("/adicionar")
    public Estoque criarEstoque(@RequestBody Estoque estoque) {
        return estoqueService.criarEstoque(estoque);
    }

    @GetMapping("/listar")
    public Estoque buscarEstoques(@RequestParam Integer id) {
        return estoqueService.buscarEstoque(id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarEstoque(@PathVariable int id) {
        this.estoqueService.deletarEstoque(buscarEstoques(id));
    }

    @GetMapping("/listar-todos")
    public List<Estoque> listarTodosEstoques() {
        return estoqueService.buscarTodosEstoques();
    }

    @PutMapping("/editar/{id}")
    public void editarEstoque(@PathVariable int id, @RequestBody Estoque novoEstoque) {
        this.estoqueService.atualizarEstoque(id, novoEstoque);
    }
}
