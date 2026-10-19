package Lessons.InheritanceAndInterfaceAndAbstrakta;

public abstract class Tree {
    protected int height;

    public Tree(int height) {
        this.height = height;
    }

    public abstract void describe();
}
