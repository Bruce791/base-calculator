package main.homework.three.task_two;

public class Chocolate extends Sweet{

    private String secret_3;

    public Chocolate(String name, double price, double weight, String secret) {
        super(name, price, weight);
        this.secret_3 = secret;
    }

    public String getSecret_1() {
        return secret_3;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "secret_3=" + secret_3 +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
