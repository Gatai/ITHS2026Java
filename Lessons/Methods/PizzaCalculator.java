package Lessons.Methods;

public class PizzaCalculator {
    private int amount;
    private int price;

    public PizzaCalculator(int amount, int price) {
        this.amount = amount;
        this.price = price;
    }

    public void printPizza() {
        System.out.println("Amount of pizzs is " + amount + " and cost " + price + " unit price.");

        var result = calculator(amount, price);

        System.out.println("Total cost: " + result);
    }

    private int calculator(int amount, int price) {
        return amount * price;
    }
}
