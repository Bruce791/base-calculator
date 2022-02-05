package calc;


import calc.exception.DivWithZero;

public interface Function {

    double sum(double a, double b);

    double sub(double a, double b);

    double mul(double a, double b);

    double div(double a, double b) throws DivWithZero;
}
