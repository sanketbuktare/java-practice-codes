
// Checking if the number is prime or not
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 2;
        if (n == 1 || n == 0) {
            System.out.println(n + " is NOT a prime number");
            System.exit(0);
        }
        while (i < n) {
            if (n % i == 0) {
                System.out.println("The number you entered is NOT a prime number");
                System.exit(0);
            }
            i++;
        }
        System.out.println("The number you entered is a prime number");

        sc.close();
    }
}
