package main.homework.six.exception;

public class DivWithZero extends Exception {
    public DivWithZero() {
        super("You can't divide by zero!");
    }
}
