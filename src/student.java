public class student {
    String name;
    int age;
    double marks;

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Madhusmita";
        s1.age = 26;
        s1.marks = 85.5;
        System.out.println("Name:" + s1.name);
        System.out.println("Age:" + s1.age);
        System.out.println("Marks:" + s1.marks);
    }
}
