package weg.arquiteturasoftware.ecommerceproject.Controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Service.ProdutoRequest;
import weg.arquiteturasoftware.ecommerceproject.Service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping("/adicionar")
    public Produto criarProduto(@RequestBody ProdutoRequest produtoRequest) {
        return this.produtoService.criarProduto(produtoRequest.getProduto(), produtoRequest.getEstoqueId());
    }

    @GetMapping("/procurar/{id}")
    public Produto buscarProduto(@PathVariable int id) {
        return this.produtoService.buscarProduto(id);
    }

    @GetMapping("/listar")
    public List<Produto> buscarProdutos(){
        return produtoService.buscarTodosProdutos();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarProduto(@PathVariable int id ) {
        this.produtoService.deletarProduto( buscarProduto( id ) );
    }

    @PutMapping("/editar/{id}")
    public void editarProduto(@PathVariable int id, @RequestBody Produto novo) {
        this.produtoService.atualizarProduto(id, novo);
    }

}
