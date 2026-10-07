package Classes20261007.Exercises3Robot;
/*
Övning 3 – Robot
•	Skapa en klass Robot med ett public field namn och ett private field batteri.
•	Sätt värdena med en konstruktor och använd this.
•	Skapa en metod visaStatus() som skriver ut namn och batteri.
•	Skapa en robot i Main. Testa vad som händer om du försöker ändra batteri direkt från Main.
*/

public class Robot {
    public String name;
    private int battery;
    
   public Robot(String name, int battery){ // konstruktor
        this.name = name;
        this.battery = 100; // Man kommer inte kunna nå denna då det är privat.
    }

    public void displayStatus(){
        System.out.println("This is " + name + " and is a robot and has " + battery + " % battery left.");
    }
}
