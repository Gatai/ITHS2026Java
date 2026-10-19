package Lessons.InheritanceAndInterfaceAndAbstrakta;

public class Main {
    public static void main(String[] args) {
        // Övning 1 – Djurparken
        // Dog dog = new Dog("Dog class");
        // Cat cat = new Cat("Cat class");
        // dog.makeSound();
        // cat.makeSound();

        // Övning 2 – Mystiska trädet
        // Tree oak = new Oak(12);
        // Tree pine = new Pine(20);
        // oak.describe();
        // pine.describe();

        // Övning 3 – Fordon med superkrafter
        // Drivable car = new Car();
        // Drivable bicycle = new Bicycle();
        // car.drive();
        // bicycle.drive();
        // startTrip(car);
        // startTrip(bicycle);

    }

    // Tillhör Övning 3 – Fordon med superkrafter
    public static void startTrip(Drivable vehicle) {
        vehicle.drive();
    }
}
