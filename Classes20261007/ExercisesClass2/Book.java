package Classes20261007.ExercisesClass2;

/*
    1. Book Class Create a Book class with the following properties: title (String), author (String), and year (int). 
        Implement a parameterless constructor that initializes the properties with default values. 
        Create an instance of the Book class using the default constructor and print the details. 
*/

public class Book {
    public String title;
    public String author;
    public int year;

   public Book(){
        this.title = "Unknown title";
        this.author = "Unknown author";
        this.year = 0;
    }
}
