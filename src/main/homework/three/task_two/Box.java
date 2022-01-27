package main.homework.three.task_two;

import java.util.Arrays;

public class Box {
    private double commonPrice;
    private double commonWeight;
    private Sweet[] sweets;

    public Box(Sweet[] sweets) {
        this.sweets = sweets;
    }

    public Sweet[] getSweets() {
        return sweets;
    }

    public double getCommonPrice() {
        Arrays.stream(sweets).forEach(sweet -> commonPrice += sweet.price);
        return commonPrice;
    }

    public double getCommonWeight() {
        Arrays.stream(sweets).forEach(sweet -> commonWeight += sweet.weight);
        return commonWeight;
    }

    @Override
    public String toString() {
        return "Box{\n" +
                "sweets= " + Arrays.toString(sweets) + "\n" +
                '}';
    }
}
