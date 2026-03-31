public class student {
    String name;
    int age;
    double marks;

    // Constructor
    // Default Constructor
    public student() {
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor
    public student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        student s1 = new student(); // default
        s1.showDetails();

        student s2 = new student("Madhusmita", 26, 85.5);
        student s3 = new student("Rahul", 24, 78.0);

        s2.showDetails();
        s3.showDetails();
    }
}
