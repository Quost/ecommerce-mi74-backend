package weg.arquiteturasoftware.ecommerceproject.Exception;

public class PrecoInvalidoException extends RuntimeException {

    public PrecoInvalidoException (){}

    public PrecoInvalidoException (String message ){
        super( message );
    }

}
