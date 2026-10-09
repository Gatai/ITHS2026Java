package Classes20261007.Exercises2Game;
/*
Övning 2 – Spelkaraktär	
•	Skapa en klass Spelkaraktar med fields för namn och liv.
•	Skapa en konstruktor som sätter namn och liv.
•	Skapa en metod presentera() som skriver ut karaktärens namn och liv.
•	Skapa två olika karaktärer i Main.
*/

public class GameCharacter {
    String name;
    int life;

    public GameCharacter(String name, int life){
        this.name = name;
        this.life = life;
        
    }

    public void Introduce(){
        System.out.println("This is " + name + " and has " + life + " life left");
    }
}
