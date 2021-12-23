package data;

public class DataException extends Exception {
    public DataException() {
        super();
    }

    public DataException(String message) {
        super(message);
    }

    public DataException(String message, Exception e) {

        super(message, e);
    }

    public DataException(Exception e) {

        super(e);
    }

}
