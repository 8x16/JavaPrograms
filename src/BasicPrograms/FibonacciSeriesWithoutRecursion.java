package BasicPrograms;

public class FibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {
        // Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
        // item[n+1] = item[n] + item[n - 1]
        // Print first 15 numbers in the series
        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print(n1 + " " + n2);
        for(int i = 3; i <= count; i++) {
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
