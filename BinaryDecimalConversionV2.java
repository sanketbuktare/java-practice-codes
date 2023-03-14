import java.util.*;

public class BinaryDecimalConversionV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to convert?\n1. Decimal to Binary\n2. Binary to Decimal");
        int option = in.nextInt();

        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        int i = 0;
        switch (option) {
            case 1:
                while (temp != 0) {
                    int bit = temp & 1;
                    sum = (bit * (int) (Math.pow(10, i))) + sum;
                    temp = temp >> 1;
                    i++;
                }
                System.out.println("Binary equivalent of " + num + " is " + sum);
                break;
            case 2:
                while (temp != 0) {
                    int bit = temp % 10;
                    if (bit == 1) {
                        sum = ((int) (Math.pow(2, i))) + sum;
                    }
                    temp = temp / 10;
                    i++;
                }
                System.out.println("Decimal equivalent of " + num + " is " + sum);
                break;
            default:
                System.out.println("Option not valid");
                break;
        }
        in.close();
    }
}
