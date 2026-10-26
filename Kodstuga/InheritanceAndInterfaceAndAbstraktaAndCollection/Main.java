package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

public class Main {
    public static void main(String[] args) {
        // Monster dragon = new Dragon("Draggg");

        Monster robot = new Robot("Rooobooot");

        Monster slime = new Slime("Slimmmee");

        Game game = new Game();
        game.playGame(robot, slime);

        Monster winner = game.playGame(robot, slime);
        System.out.println("Vinnare: " + winner.getName());

    }
}
