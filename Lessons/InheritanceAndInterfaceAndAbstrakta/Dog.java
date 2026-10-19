package Lessons.InheritanceAndInterfaceAndAbstrakta;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("dog class");
    }
}
