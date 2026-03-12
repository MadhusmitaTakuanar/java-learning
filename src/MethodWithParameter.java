public class MethodWithParameter {
    public static void showInfo(String name, int age) {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        showInfo("Madhusmita",26);
        showInfo("xyz",25);
        showInfo("Priya", 22);
    }
}
