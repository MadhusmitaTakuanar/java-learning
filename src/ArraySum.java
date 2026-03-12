public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Total Sum: " + sum);
        int[] number = {2, 4, 6};

        for(int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
