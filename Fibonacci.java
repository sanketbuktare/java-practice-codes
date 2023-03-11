import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.println("0\n1");
        for (int i = 0; i < n - 2; i++) {
            int sum = a+b;
            a = b;
            b = sum;
            System.out.println(sum);
        }

        in.close();
    }
}
