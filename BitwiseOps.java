import java.util.Scanner;

public class BitwiseOps {
    public static void main(String[] args) {
        System.out.println(" Enter values of a and b: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("a & b: " + (a&b));
        System.out.println("a | b: " + (a|b));
        System.out.println("~a  and  ~b: " + (~a) + " and " + (~b));
        System.out.println("a ^ b: " + (a^b));

        in.close();
    }
}
