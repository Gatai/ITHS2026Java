package Lessons.InheritanceAndInterfaceAndAbstrakta;

public class Cat extends Animal implements Playable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat class");
    }

    @Override
    public void play() {
        System.out.println("Cat plays with a yarn ball!");
    }
}
