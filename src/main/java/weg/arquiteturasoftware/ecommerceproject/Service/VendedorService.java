package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Entity.Vendedor;
import weg.arquiteturasoftware.ecommerceproject.Repository.ProdutoRepository;
import weg.arquiteturasoftware.ecommerceproject.Repository.VendedorRepository;

import java.util.List;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public void registrarVenda(Vendedor vendedor, double valorVenda) {
        vendedor.setQuantidadeVendas(vendedor.getQuantidadeVendas() + 1);
        vendedor.setTotalVendas(vendedor.getTotalVendas() + valorVenda);
        vendedorRepository.save(vendedor);
    }

    public double calcularFaturamentoTotal() {
        List<Vendedor> vendedores = vendedorRepository.findAll();
        return vendedores.stream()
                .mapToDouble(Vendedor::getTotalVendas)
                .sum();
    }

    public int obterQuantidadeVendas(Vendedor vendedor) {
        return vendedor.getQuantidadeVendas();
    }

    public void resetarVendas(Vendedor vendedor) {
        vendedor.setQuantidadeVendas(0);
        vendedor.setTotalVendas(0.0);
        vendedorRepository.save(vendedor);
    }
}

