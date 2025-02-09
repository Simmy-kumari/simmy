import java.util.Scanner;
public class CharacterPattern {
    public static void main(String args[]) {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = Sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
          char ch = 'A'; // Starting character
          for (int j = 1; j <= i; j++) { // Inner loop runs 'i' times
            System.out.print(ch); 
            ch++;
          }
          System.out.println(); // Move to the next line after each row
        }
    }
}
