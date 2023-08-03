package ro.bcr.product_app.exception;

import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ProductAppExceptionHandler {

    @ExceptionHandler(value = ProductAppException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ClientError handleProductAppEx(ProductAppException ex){
        log.warn("An exception occurred with message {}", ex.getMessage());
        return new ClientError(ex.getMessage(), 404);
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ClientError handleValidationEx(ConstraintViolationException ex){
        log.warn("An exception occurred with message {}", ex.getMessage());
        return new ClientError("Validation failed", 400);
    }
}
