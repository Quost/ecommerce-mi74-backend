package weg.arquiteturasoftware.ecommerceproject.Exception;

public class ProdutoInvalidoException extends RuntimeException {

    public ProdutoInvalidoException (){}

    public ProdutoInvalidoException (String message ){
        super( message );
    }

}
