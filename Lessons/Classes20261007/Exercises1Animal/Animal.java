package Lessons.Classes20261007.Exercises1Animal;
/*
Övning 1 – Djur
•	Skapa en klass Djur med ett field som heter ljud.
•	Skapa en konstruktor som tar emot ljudet.
•	Skapa metoden gorLjud() som skriver ut ljudet.
•	Skapa en hund och en katt i Main och låt dem göra olika ljud.
*/

public class Animal {
    String sound; // Detta är en field / instansvariabel

    // här skapas en konstruktorn i klassen animal
    public Animal(String sound) {

        this.sound = sound;
    }

    public String goSound() {
        return sound;
    }
}
