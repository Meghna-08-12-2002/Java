class Factorial {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Factorials of array elements:");
        for (int num : numbers) {
            System.out.println(num + "! = " + factorial(num));
        }
    }
    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}