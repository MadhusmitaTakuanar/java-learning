public class student {
    String name;
    int age;
    double marks;

    // Constructor
    public student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        student s1 = new student("Madhusmita", 26, 85.5);
        student s2 = new student("Keshab", 28, 78.0);
        student s3 = new student("Shivantika", 26, 100);

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
