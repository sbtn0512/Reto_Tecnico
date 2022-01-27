package co.com.qvision.certification.challenge.exceptions;

public class FailedPurchaseException extends AssertionError{

    public FailedPurchaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
