package main.homework.three.task_two;

public class Jellybean extends Sweet{

    private String secret_2;

    public Jellybean(String name, double price, double weight, String secret) {
        super(name, price, weight);
        this.secret_2 = secret;
    }

    public String getSecret_1() {
        return secret_2;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "secret_2=" + secret_2 +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
