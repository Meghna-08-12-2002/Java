class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*Key Concepts Used
Array Declaration and Initialization – An integer array is declared and initialized with {1, 2, 3, 4, 5}.

In-Place Array Reversal – The array is reversed by swapping elements using two-pointer technique (i and j).

For Loop with Multiple Variables – for (int i = 0, j = arr.length - 1; i < j; i++, j--) uses two loop variables to iterate from both ends.

Swapping Logic – Temporary variable temp is used to swap values without data loss.

Enhanced For Loop – for (int num : arr) is used to print the array elements after reversal.

Efficient Space Usage – No extra array is used; the reversal is done in-place, demonstrating memory-efficient logic.*/
