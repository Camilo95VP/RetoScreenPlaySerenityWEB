package co.com.sofka.data.user.orderpage;

public class ValidationString extends AssertionError{

    public static final String VALIDATION_DO_NOT_MATCH = "The validation don't match. %s";

    public ValidationString(String message, Throwable cause){
        super(message, cause);
    }

}
