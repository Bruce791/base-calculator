package calc.exception;

public class DivWithZero extends Exception {
    public DivWithZero() {
        super("You can't divide by zero!");
    }
}
