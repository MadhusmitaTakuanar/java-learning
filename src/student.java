import java.util.ArrayList;

public class student {

    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();

        // CREATE
        students.add(new student("Madhusmita", 26));
        students.add(new student("Rahul", 24));
        students.add(new student("Priya", 22));

        // READ
        System.out.println("All Students:");
        for (student s : students) {
            s.showDetails();
        }

        // DELETE (remove Rahul)
        students.removeIf(s -> s.getName().equals("Rahul"));

        System.out.println("\nAfter Deletion:");
        for (student s : students) {
            s.showDetails();
        }

        // SEARCH
        String searchName = "Priya";
        boolean found = false;

        for (student s : students) {
            if (s.getName().equals(searchName)) {
                System.out.println("\nStudent Found:");
                s.showDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent not found");
        }
        // UPDATE (change Priya's age)
        // UPDATE
        String updateName = "Priya";

        for (student s : students) {
            if (s.getName().equals(updateName)) {
                System.out.println("\nUpdating student...");
                s.setAge(30);
            }
        }
        System.out.println("\nAfter Update:");
        for (student s : students) {
            s.showDetails();
        }
    }
}