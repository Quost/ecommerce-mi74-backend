package weg.arquiteturasoftware.ecommerceproject.Exception;

public class ProdutoNaoEncontradoException extends RuntimeException {

    public ProdutoNaoEncontradoException (){}

    public ProdutoNaoEncontradoException(String message) {
        super(message);
    }
}
