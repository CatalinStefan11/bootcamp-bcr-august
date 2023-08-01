package ro.bcr.advanced._3_exceptions;

public class DemoExceptions {

    public static void main(String[] args) {

        try {
            doBusinessLogic();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try{
            anotherBusinessLogic();
        } catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }


    }

    public static void doBusinessLogic() throws CheckCustomException {
        System.out.println("Doing business logic");
        throw new CheckCustomException("Checked exception");
    }

    public static void anotherBusinessLogic() {
        System.out.println("Doing business logic");
        throw new CustomException("Unchecked exception");
    }
}


// unchecked exception
class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

// checked exception
class CheckCustomException extends Exception {

    public CheckCustomException(String message) {
        super(message);
    }

    public CheckCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
