// Function that checks if the number is even or not

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        boolean ans = isEven(n);

        System.out.printf(ans ? "Even" : "Odd");
        in.close();
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}
