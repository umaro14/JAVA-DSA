package RECURSION;

public class FactorialExample {

    public static int factorial(int n) {
        if (n == 0) return 1; // 🛑 base case
        return n * factorial(n - 1); // 📞 recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // ➡ 120
    }
}

