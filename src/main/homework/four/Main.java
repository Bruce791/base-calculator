package main.homework.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the first number: ");
            calculator.setA(Double.parseDouble(br.readLine()));
            System.out.print("Enter the second number: ");
            calculator.setB(Double.parseDouble(br.readLine()));
            System.out.print("Enter the operation (example +, -, *, /): ");
            calculator.setOperation(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + ", expected number! (example 1 or 1.0)");
        }
    }
}
