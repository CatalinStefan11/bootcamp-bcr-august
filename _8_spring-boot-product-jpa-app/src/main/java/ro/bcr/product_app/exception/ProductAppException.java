package ro.bcr.product_app.exception;

public class ProductAppException extends RuntimeException {

    public ProductAppException() {
    }

    public ProductAppException(String message) {
        super(message);
    }
}
