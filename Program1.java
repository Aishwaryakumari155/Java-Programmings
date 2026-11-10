
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Conditional statement
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // Loop
        System.out.println("Numbers from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}