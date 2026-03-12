public class ReturnMethodExample {
    public static int addNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {

        int sum = addNumbers(5, 10);
        int sum2 = addNumbers(20, 30);
        int sum3 = addNumbers(7, 3);


        System.out.println("Sum is: " + sum);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);

    }
}
