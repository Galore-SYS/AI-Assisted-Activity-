public class Main {

    public static void main(String[] args) {
        int factorialNumber = 4;
        int result = factorial(factorialNumber);
        System.out.println(result);
    }


    public static int factorial(int n) {
    // 1. because every step depends on the one before it like a chain.
    // 2. factorial(-2) just instantly returns 1 because -2 is less than 1, so it triggers the base case right away without doing any actual recursion.
    if (n <= 1){
        return 1; }
    return n * factorial(n - 1);
    }

    
}
