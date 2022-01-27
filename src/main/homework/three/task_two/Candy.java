package main.homework.three.task_two;

public class Candy extends Sweet{

    private String secret_1;

    public Candy(String name, double price, double weight, String secret) {
        super(name, price, weight);
        this.secret_1 = secret;
    }

    public String getSecret_1() {
        return secret_1;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "secret_1=" + secret_1 +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
