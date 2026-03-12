public class IfExample {
    public static void main(String[] args) {
        int age = 20;
        int number = 7;
        int marks = 85;
//        if (age >= 18) {
//            System.out.println("You are eligible to vote");
//        }
//        if (number % 2 == 0) {
//            System.out.println("Even Number");
//        } else {
//            System.out.println("Odd Number");
//        }
        if (marks >= 90) {
            System.out.println("Grade A+");
        }
        else if (marks >= 75) {
            System.out.println("Grade A");
        }
        else if (marks >= 60) {
            System.out.println("Grade B");
        }
        else {
            System.out.println("Grade C");
        }


    }
}
