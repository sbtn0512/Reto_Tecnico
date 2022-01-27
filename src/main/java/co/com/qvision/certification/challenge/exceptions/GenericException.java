package co.com.qvision.certification.challenge.exceptions;

public class GenericException extends AssertionError {
    public GenericException(String msg, Exception e) { super(msg, e); }
}
