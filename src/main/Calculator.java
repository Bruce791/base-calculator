package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private String operation;

    /**
     * Метод для запуска калькулятора в консоле
     *
     */
    public void start() {
        initializationOfRequiredFields();
        result(firstNumber, secondNumber, operation);
    }

    /**
     * Метод присваивает переменным пользовательские значения
     *
     *  {@link Calculator#firstNumber}
     * {@link Calculator#secondNumber}
     * {@link Calculator#operation}
     */
    private void initializationOfRequiredFields() {
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Введите первое число: ");
            firstNumber = Double.parseDouble(br.readLine());
            System.out.print("Введите второе число: ");
            secondNumber = Double.parseDouble(br.readLine());
            System.out.print("Введите операцию (пример +, -, *, /): ");
            operation = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод выполняет основные математические операции с двумя числами и выводит результат (до 4-х знаков после запятой)
     *
     * @param firstNumber заданное пользователем число 1
     * @param secondNumber заданное пользователем число 2
     * @param operation заданное пользователем операция
     */
    private void result(double firstNumber, double secondNumber, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Введена некорректная операция!");
                break;
        }
        System.out.printf("%.4f", result);
    }
}
