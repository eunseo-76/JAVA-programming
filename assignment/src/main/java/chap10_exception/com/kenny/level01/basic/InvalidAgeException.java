package chap10_exception.com.kenny.level01.basic;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
