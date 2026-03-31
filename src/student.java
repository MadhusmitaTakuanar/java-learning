public class student {

    private String name;
    private int age;
    private double marks;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {   // validation
            this.age = age;
        }
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        student s1 = new student();

        s1.setName("Madhusmita");
//        s1.setAge(26);
        s1.setMarks(85.5);
        s1.setAge(-5);
        s1.showDetails();
    }
}