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

        // Övning 4 – Djurens talangshow
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        Animal dogAsAnimal = dog;
        Animal catAsAnimal = cat;

        dogAsAnimal.makeSound();
        catAsAnimal.makeSound();

        showTalent(dog);
        showTalent(cat);
    }

    // Tillhör Övning 3 – Fordon med superkrafter
    public static void startTrip(Drivable vehicle) {
        vehicle.drive();
    }

    // Tillhör Övning 4 – Djurens talangshow
    public static void showTalent(Playable participant) {
        participant.play();
    }
}
