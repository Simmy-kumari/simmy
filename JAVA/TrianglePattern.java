import java.util.*;
public class TrianglePattern {
    public static void printPattern(int n)
    {
      for (int i = 0; i < n; i++) {
        // inner loop to print spaces.
        for (int j = n - i; j > 1; j--) {
          System.out.print(" ");}
        // inner loop to print stars.
        for (int j = 0; j <= i; j++) {
          System.out.print("* ");
        }
        // printing new line for each row
          System.out.println();}}
    public static void main(String args[]){
      int n = 6;
      printPattern(n);
    }
}