package Lessons.InheritanceAndInterfaceAndAbstrakta;

public class Dog extends Animal implements Playable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("dog class");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch!");
    }
}
