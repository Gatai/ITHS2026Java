package Classes20261007.ExercisesClassStudent;

public class Student {
    /*
     * 2. Student Class Create a Student class with the following properties: name
     * (String), age (int), and grade (double).
     * Implement a parameterized constructor that initializes all the properties.
     * Create an instance of the Student class with sample values and print the
     * details.
     */

    public String name;
    public int age;
    public double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayData() {
        System.out.println("This is the student: " + name + "and age: " + age + "and the grade " + grade);
    }
}
