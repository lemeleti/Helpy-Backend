package ch.zhaw.pm3.helpy.exception;

/**
 * Is thrown if a record could not be found in the database.
 */
public class RecordNotFoundException extends RuntimeException {
    /**
     * Creates a new record not found exception instance.
     * @param message String
     */
    public RecordNotFoundException(String message) {
        super(message);
    }
}
