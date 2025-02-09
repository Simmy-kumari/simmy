import java.util.Scanner;
public class NumberConversion {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.print("Binary: ");
        convertToBinary(n);
        System.out.print("Hexadecimal: ");
        convertToHexadecimal(n);
    }
    // Function to convert number to binary
    public static void convertToBinary(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
         StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2); // Prepend the remainder to the binary string
            n = n / 2; 
        }
        System.out.println(binary); }
    // Function to convert number to hexadecimal
    public static void convertToHexadecimal(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        StringBuilder hexadecimal = new StringBuilder();
        String hexChars = "0123456789ABCDEF";
        while (n > 0) {
            int remainder = n % 16;
            hexadecimal.insert(0, hexChars.charAt(remainder)); // Prepend the character for the remainder
            n = n / 16; 
        }
        System.out.println(hexadecimal);}}
