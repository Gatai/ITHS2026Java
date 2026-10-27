package Kodstuga.InheritanceAndInterfaceAndAbstraktaAndCollection;

public class Main {
    public static void main(String[] args) {

        // Mock data
        Monster dragon = new Dragon("Draggg");
        Monster robot = new Robot("Rooobooot");
        Monster slime = new Slime("Slimmmee");

        // Monster dragon1 = new Dragon("Flarefang");
        // Monster dragon2 = new Dragon("Stormscale");
        // Monster dragon3 = new Dragon("Pyroclaw");

        // Monster robot1 = new Robot("Mecha-01");
        // Monster robot2 = new Robot("TitanCore");
        // Monster robot3 = new Robot("SteelRunner");

        // Monster slime1 = new Slime("Gloob");
        // Monster slime2 = new Slime("Blorpy");
        // Monster slime3 = new Slime("Meltblob");
        // Monster slime4 = new Slime("Squishlord");

        Game game = new Game();

        Monster winner = game.playGame(robot, slime);

        System.out.println("Vinnare: " + winner.getName());

    }
}
