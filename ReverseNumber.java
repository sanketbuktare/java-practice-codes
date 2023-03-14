import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        System.out.println(n + " <=> " + sum);
        in.close();
    }
}
