import java.util.*;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = in.nextInt();

        // Brute force method
        for (int i = 0; i <= 30; i++) {
            if (Math.pow(2, i) == n) {
                System.out.println("Power of 2");
                System.exit(0);
            }
        }
        System.out.println("Not a Power of 2");

        in.close();
    }
}
