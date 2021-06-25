import java.util.*;

class factorialOfSum {

    public static void main(String[] args) {

        int[] arr = { 10, 3, 15, 5, 6, 22, 55, 23 };
        int sum = 0;
        int n = arr.length;
        long factorial = 1;
        for (int i = arr[n]; i <= n; ++i) {
            factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", sum, factorial);

        /*
         * int[] arr = { 7, 3, 5, 4, 8 }; int n = arr.length;
         * System.out.println(sumFactorial(arr, n)); }
         * 
         * //int sumFactorial(int[] arr, int n) {
         * 
         * // To store the required sum int sum = 0; for (int i = 0; i < n; i++) {
         * 
         * // Add factorial of all the elements sum += factorial(arr[i]); } return sum;
         */
    }

    // Driver Code

}
