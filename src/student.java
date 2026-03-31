public class student {
    String name;
    int age;
    double marks;

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Madhusmita";
        s1.age = 26;
        s1.marks = 85.5;

        student s2 = new student();
        s2.name = "Keshab";
        s2.age = 28;
        s2.marks = 78.0;

        student s3 = new student();
        s3.name = "Shivantika";
        s3.age = 26;
        s3.marks = 100;

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
