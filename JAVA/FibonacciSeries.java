import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();
        // Display Fibonacci using non-recursive approach
        System.out.println("Fibonacci series (Non-recursive): ");
        printFibonacciNonRecursive(n);
        // Display Fibonacci using recursive approach
        System.out.println("Fibonacci series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
    // Non-recursive approach to print Fibonacci series
    public static void printFibonacciNonRecursive(int n) {
        int first = 0, second = 1;
        if (n > 0) {
            System.out.print(first + " ");
        }
        if (n > 1) {
            System.out.print(second + " ");
        }
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println(); 
    }// Recursive function to find nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);}}
