package Classes20261007;

import Classes20261007.Exercises1Animal.Animal;
import Classes20261007.Exercises2Game.GameCharacter;
import Classes20261007.Exercises3Robot.Robot;
import Classes20261007.ExercisesClass2.Book;

public class Wednesday {
      public static void main(String[] args){
        
        // Första Övningar Klasser.docx
        //ExerciseClass1();

        // Andra filen Övningar Klasser2.docx book
        ExerciseClass2();

    }

    public static void ExerciseClass1(){
         //Exercises 1 animal
        Animal dog = new Animal("Woff");
        System.out.println(dog.goSound());

        Animal cat = new Animal("Cat mjau");
        System.out.println(cat.goSound()); // Skillnaden här och nedan är att jag skriver ut System.out.println() här i main och resterande är att jag skriver ut de i deras klass. De gör samma sak men jag väljer själv vart logiken/ koden skall vara. 

        // Exercises 2 Game character
        GameCharacter anna = new GameCharacter("Anna", 5);
        anna.Introduce();

        GameCharacter bamse = new GameCharacter("Bamse", 55);
        bamse.Introduce();

        // Exercises 3 Robot
        Robot turbo = new Robot("Turbo", 500); // värdet 500 spelar ingen roll då den bara skriver över och använder default värdet.
        turbo.name = "new name";
        turbo.displayStatus();

        // Överlagrade konstruktorers
        Robot tes = new Robot(1998);
        tes.displayStatus();
    }

    public static void ExerciseClass2(){
        /*
        1. Book Class Create a Book class with the following properties: title (String), author (String), and year (int). 
            Implement a parameterless constructor that initializes the properties with default values. 
            Create an instance of the Book class using the default constructor and print the details. 
        */
        Book book = new Book();
        book.title = "title m";
        book.author = "test";
        book.year = 1995;

        System.out.println(book.title); 
    }
}

