package weg.arquiteturasoftware.ecommerceproject.Service;

import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;

public class ProdutoRequest {
    private Produto produto;
    private Integer estoqueId;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(Integer estoqueId) {
        this.estoqueId = estoqueId;
    }
}
