package Stack;

public class StackTooSmallException extends Exception {
    public StackTooSmallException(String errorMessage) {
        super(errorMessage);
    }
}
