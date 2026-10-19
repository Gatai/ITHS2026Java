package Lessons.InheritanceAndInterfaceAndAbstrakta;

public class Main {
    public static void main(String[] args) {
        // Övning 1 – Djurparken
        // Dog dog = new Dog("Dog class");
        // Cat cat = new Cat("Cat class");
        // dog.makeSound();
        // cat.makeSound();

        // Övning 2 – Mystiska trädet
        Tree oak = new Oak(12);
        Tree pine = new Pine(20);

        oak.describe();
        pine.describe();
    }
}
