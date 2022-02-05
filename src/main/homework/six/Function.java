package main.homework.six;

import main.homework.six.exception.DivWithZero;

public interface Function {

    double sum(double a, double b);

    double subtraction(double a, double b);

    double multiplication(double a, double b);

    double div(double a, double b) throws DivWithZero;
}
