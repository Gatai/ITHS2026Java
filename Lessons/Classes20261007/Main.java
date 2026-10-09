package Lessons.Classes20261007;

import Lessons.Classes20261007.Exercises1Animal.Animal;
import Lessons.Classes20261007.Exercises2Game.GameCharacter;
import Lessons.Classes20261007.Exercises3Robot.Robot;
import Lessons.Classes20261007.ExercisesClassBook.Book;
import Lessons.Classes20261007.ExercisesClassCar.Car;
import Lessons.Classes20261007.ExercisesClassStudent.Student;

public class Main {
    public static void main(String[] args) {

        // Första Övningar Klasser.docx
        // ExerciseClass1();

        // Andra filen Övningar Klasser2.docx book
        // ExerciseBook();

        // Andra filen Övningar Klasser2.docx student
        // ExerciseStudent();

        // Andra filen Övningar Klasser2.docx car
        ExerciseCar();

    }

    public static void ExerciseCar() {
        Car car = new Car("Volvo", "golf", 1998, "Blue");

        car.displayData();
    }

    public static void ExerciseClass1() {
        // Exercises 1 animal
        Animal dog = new Animal("Woff");
        System.out.println(dog.goSound());

        Animal cat = new Animal("Cat mjau");
        System.out.println(cat.goSound()); // Skillnaden här och nedan är att jag skriver ut System.out.println() här i
                                           // main och resterande är att jag skriver ut de i deras klass. De gör samma
                                           // sak men jag väljer själv vart logiken/ koden skall vara.

        // Exercises 2 Game character
        GameCharacter anna = new GameCharacter("Anna", 5);
        anna.Introduce();

        GameCharacter bamse = new GameCharacter("Bamse", 55);
        bamse.Introduce();

        // Exercises 3 Robot
        Robot turbo = new Robot("Turbo", 500); // värdet 500 spelar ingen roll då den bara skriver över och använder
                                               // default värdet.
        turbo.name = "new name";
        turbo.displayStatus();

        // Överlagrade konstruktorers
        Robot tes = new Robot(1998);
        tes.displayStatus();
    }

    public static void ExerciseBook() {
        /*
         * 1. Book Class Create a Book class with the following properties: title
         * (String), author (String), and year (int).
         * Implement a parameterless constructor that initializes the properties with
         * default values.
         * Create an instance of the Book class using the default constructor and print
         * the details.
         */
        Book book = new Book();
        book.title = "title m";
        book.author = "test";
        book.year = 1995;

        System.out.println(book.title);
    }

    public static void ExerciseStudent() {
        /*
         * 2. Student Class Create a Student class with the following properties: name
         * (String), age (int), and grade (double).
         * Implement a parameterized constructor that initializes all the properties.
         * Create an instance of the Student class with sample values and print the
         * details.
         */

        Student student = new Student("test", 55, 85.20);

        student.displayData();
    }
}
