package Lessons.InheritanceAndInterfaceAndAbstrakta;

public class Pine extends Tree {
    public Pine(int heigh) {
        super(heigh);
    }

    @Override
    public void describe() {
        System.out.println("This is a pine tree, height: " + height + " meters.");
    }

}
