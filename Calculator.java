import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = in.nextInt();

        System.out.println("Select operation: \n1. +\n2. -\n3. *\n4. /\n5. %");
        int op = in.nextInt();

        switch(op) {
            case 1:
                System.out.printf("Result: %d + %d = %d", n1, n2, n1+n2 );
                break;
            case 2:
                System.out.printf("Result: %d - %d = %d", n1, n2, n1-n2 );
                break;
            case 3:
                System.out.printf("Result: %d * %d = %d", n1, n2, n1*n2 );
                break;
            case 4:
                System.out.printf("Result: %d / %d = %d", n1, n2, n1/n2 );
                break;
            case 5:
                System.out.printf("Result: %d % %d = %d", n1, n2, n1%n2 );
                break;
            case 6:
                System.out.print("Exiting...");
                System.exit(0);
                break;   
            default:
                System.out.println("Option not valid");
                break;
        }

        in.close();
    }
}
