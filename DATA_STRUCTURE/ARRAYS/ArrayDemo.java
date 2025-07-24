package DATA_STRUCTURE.ARRAYS;

public class ArrayDemo {
     public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

       
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        
        numbers[2] = 99;
        System.out.println("After update: " + numbers[2]);
    }
}
