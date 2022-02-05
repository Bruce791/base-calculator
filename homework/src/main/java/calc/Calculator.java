package calc;


import calc.exception.DivWithZero;
import calc.exception.IncorrectOperator;

public class Calculator implements Function {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) throws DivWithZero {
        if (b == 0) {
            throw new DivWithZero();
        }
        return a / b;
    }

    public void setOperation(String operation) throws IncorrectOperator {
        switch (operation) {
            case "+":
                System.out.println(sum(a, b));
                break;
            case "-":
                System.out.println(sub(a, b));
                break;
            case "*":
                System.out.println(mul(a, b));
                break;
            case "/":
                try {
                    System.out.println(div(a, b));
                } catch (DivWithZero ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            default:
                throw new IncorrectOperator();
        }
    }
}
