package main.homework.two;

import main.homework.one.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Выберите действие:\n1 - Калькулятор \n2 - Поиск максимального элемента в массиве");
        int inputNumber = Integer.parseInt(br.readLine());

        switch (inputNumber) {
            case 1:
                new Calculator().start();
                break;
            case 2:
                setArraySize();
                break;
            default:
                System.out.println("Введено не корректное число/символ");
        }

        br.close();
    }


    private static void setArraySize() {
        System.out.println("Задайте размерность массива");
        String[] arrayOfWords = null;
        try {
            arrayOfWords = new String[Integer.parseInt(br.readLine())];
            for (int i = 0; i < arrayOfWords.length; i++) {
                System.out.printf("Введите слово №%d\n", i + 1);
                arrayOfWords[i] = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        searchForMaxElementInArray(arrayOfWords);
    }

    private static void searchForMaxElementInArray(String[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Масиив пустой или равен null");
            return;
        }
        System.out.println("Самое длинное слово в массиве - " + Collections.max(Arrays.asList(array)));
    }
}
