class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int evenCount = 0, oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even number count: " + evenCount);
        System.out.println("Odd number count: " + oddCount);
    }
}