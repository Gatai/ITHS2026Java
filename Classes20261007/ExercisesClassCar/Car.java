package Classes20261007.ExercisesClassCar;
/*
3. Car Class Create a Car class with the following properties: make (String), model (String), year (int), and color (String).
    Implement multiple constructors, including a parameterized constructor and constructor chaining. 
    Create instances of the Car class using different constructors and print the details. 
*/

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayData() {
        System.out.println(
                "This is the car brand: " + brand + "and model: " + model + " and year " + year + " and color "
                        + color);
    }

}
