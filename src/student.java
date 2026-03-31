import java.util.ArrayList;

public class student {

    private String name;
    private int age;

    // Constructor
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<student> students = new ArrayList<>();

        // Add objects
        students.add(new student("Madhusmita", 26));
        students.add(new student("Rahul", 24));
        students.add(new student("Priya", 22));
        students.add(new student("shree", 26));

        // Loop through list
        for (student s : students) {
            s.showDetails();
        }
    }
}