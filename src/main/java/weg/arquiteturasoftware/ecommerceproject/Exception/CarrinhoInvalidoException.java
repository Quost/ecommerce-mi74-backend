package weg.arquiteturasoftware.ecommerceproject.Exception;

public class CarrinhoInvalidoException extends RuntimeException {

    public CarrinhoInvalidoException (){}

    public CarrinhoInvalidoException (String message ){
        super( message );
    }

}
