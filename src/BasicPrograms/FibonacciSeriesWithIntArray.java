package BasicPrograms;

public class FibonacciSeriesWithIntArray {
    public static void main(String[] args) { // Total O(n)
        // Array to store the series
        int count = 10;
        int[] series = new int[count];
        // Setting the starting numbers in the series
        series[0] = 0;
        series[1] = 1;
        for(int i = 2; i < series.length; i++) { // O(n) - time complexity
            series[i] = series[i-1] + series[i-2];
        }
        for (int i : series) {
            System.out.print(i + " ");
        }
    }
}
