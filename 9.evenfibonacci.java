import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();

        scanner.close();

        long sum = calculateEvenFibonacciSum(limit);

        System.out.println("Sum of even Fibonacci numbers up to " + limit + ": " + sum);
    }

    private static long calculateEvenFibonacciSum(int limit) {
        long a = 1, b = 2, sum = 0;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }

            long temp = a + b;
            a = b;
            b = temp;
        }

        return sum;
    }
}
