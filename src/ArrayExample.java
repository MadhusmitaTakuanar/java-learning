public class ArrayExample {
    public static void main(String[] args) {
        String[] names = {"Madhusmita", "Rahul", "Priya", "Amit"};
        int[] numbers = {10,20,30,40,50};
        String[] cities = {"Kolkata", "Delhi", "Mumbai", "Chennai"};
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);

        }
        for (int i = 0; i< cities.length; i++){
            System.out.println(cities[i]);
        }
    }
}
