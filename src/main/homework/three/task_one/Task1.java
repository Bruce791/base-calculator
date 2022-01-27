package main.homework.three.task_one;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = fillWithRandomNumbers();
        System.out.println("Array after replace:" + Arrays.toString(arrayOfNumbers));
        findMaxNegativeAndMinPositiveElements(arrayOfNumbers);
        System.out.println("Array before replace:" + Arrays.toString(arrayOfNumbers));
    }

    private static int[] fillWithRandomNumbers() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        Arrays.sort(array);
        return array;
    }

    private static void findMaxNegativeAndMinPositiveElements(int[] arrayOfNumbers) {
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int positive = 0, negative = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if ((arrayOfNumbers[i] < 0) && (maxNegative < arrayOfNumbers[i])) {
                maxNegative = arrayOfNumbers[i];
                negative = i;
            }
            if ((arrayOfNumbers[i] > 0) && (minPositive > arrayOfNumbers[i])) {
                minPositive = arrayOfNumbers[i];
                positive = i;
            }
        }

        System.out.println("Min positive: " +  minPositive);
        System.out.println("Max negative: " + maxNegative);
        swap(arrayOfNumbers, negative, positive);
    }

    private static void swap(int[] arrayOfNumbers, int negative, int positive) {
        int tmp = arrayOfNumbers[negative];
        arrayOfNumbers[negative] = arrayOfNumbers[positive];
        arrayOfNumbers[positive] = tmp;
    }
}
