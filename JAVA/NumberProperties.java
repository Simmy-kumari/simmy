import java.util.Scanner;
public class NumberProperties {
    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;}
    // Method to check if a number is Armstrong
    static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = 0;
        while (temp > 0) { 
            temp /= 10;
            digits++;}
        temp = n;
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }
    // Method to check if a number is perfect
    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Calculate the sum of digits
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum is " + sum);
        System.out.println("Prime: " + (isPrime(sum) ? "Yes" : "No"));
        System.out.println("Armstrong: " + (isArmstrong(sum) ? "Yes" : "No"));
        System.out.println("Perfect: " + (isPerfect(sum) ? "Yes" : "N0"));
        sc.close();
    }
}
