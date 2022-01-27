package main.homework.three.task_two;

public class Main {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Nestle", 99.2, 1.3, "x");
        Candy candy = new Candy("Kinder", 1.1, 2.0, "z");
        Jellybean jellybean = new Jellybean("Haribo", 90.7, 0.33, "y");
        Box candyBox = new Box(new Sweet[]{chocolate, candy, jellybean});

        System.out.println(candyBox);
        System.out.println("commonPrice: " + candyBox.getCommonPrice());
        System.out.println("commonWeight: " + candyBox.getCommonWeight());
    }
}
