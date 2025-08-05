package RECURSION;

public class RecursionDemo {

    public static void printNumbers(int n) {
        if (n == 0) return; // 🛑 base case: stop when n is 0

        System.out.println(n); // 🔁 print current number
        printNumbers(n - 1);   // 📞 call the same method with smaller input
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}

