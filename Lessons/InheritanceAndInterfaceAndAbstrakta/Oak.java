package Lessons.InheritanceAndInterfaceAndAbstrakta;

// Detta är inte en abstract klass därav kan jag skapa en ny instans av objektet
public class Oak extends Tree {
    public Oak(int height) {
        super(height);
    }

    @Override
    public void describe() {
        System.out.println("This is an oak tree, height: " + height + " meters.");
    }
}
