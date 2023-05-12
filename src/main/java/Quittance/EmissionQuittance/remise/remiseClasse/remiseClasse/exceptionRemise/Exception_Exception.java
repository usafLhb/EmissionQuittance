package Quittance.EmissionQuittance.remise.remiseClasse.remiseClasse.exceptionRemise;

public class Exception_Exception extends java.lang.Exception{
    private  Exception exception;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message,  Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message,  Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public  Exception getFaultInfo() {
        return this.exception;
    }
}
