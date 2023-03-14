import java.util.*;

public class IntegerComplement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("Complement of " + n + " is: " + 1);
            System.exit(0);
        }

        int temp = n;
        int mask = 0;
        while (temp != 0) {
            temp = temp >> 1;
            mask = mask << 1;
            mask = mask | 1;
        }
        System.out.println("Complement of " + n + " is: " + (mask & ~n));
        in.close();
    }
}
