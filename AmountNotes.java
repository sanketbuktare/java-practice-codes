import java.util.Scanner;

public class AmountNotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount: ");

        int amount = in.nextInt();
        int note100 = 0, note50 = 0, note20 = 0, note1 = 0;

        switch (amount / 100) {
            case 0:
                break;
            default:
                note100 = amount / 100;
                amount = amount % 100;
        }

        switch (amount / 50) {
            case 0:
                break;
            default:
                note50 = amount / 50;
                amount = amount % 50;
        }

        switch (amount / 20) {
            case 0:
                break;
            default:
                note20 = amount / 20;
                amount = amount % 20;
        }

        switch (amount / 1) {
            case 0:
                break;
            default:
                note1 = amount / 1;
                amount = amount % 1;
        }

        System.out.println("Notes of 100 = " + note100);
        System.out.println("Notes of 50 = " + note50);
        System.out.println("Notes of 20 = " + note20);
        System.out.println("Notes of 1 = " + note1);

        in.close();
    }
}
