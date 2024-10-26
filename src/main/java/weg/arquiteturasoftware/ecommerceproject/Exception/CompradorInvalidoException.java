package weg.arquiteturasoftware.ecommerceproject.Exception;

public class CompradorInvalidoException extends RuntimeException {

    public CompradorInvalidoException (){}

    public CompradorInvalidoException (String message ){
        super( message );
    }
}
