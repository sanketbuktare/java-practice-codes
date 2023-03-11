import java.util.*;

public class TemperatureCoverter {
    public static void main(String[] args) {
        System.out.println("Select your choice: ");
        System.out.println("1. Fahrenheit to Celsius \n2. Celsius to Fahrenheit");

        Scanner in = new Scanner(System.in);

        int option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter Fahrenheit: ");
                int fah = in.nextInt();
                float cel = (fah - 32) * 5 / 9;
                System.out.println(fah + "°F in Celsius is: " + cel + "°C");
                break;
            case 2:
                System.out.println("Enter Celsius: ");
                int cel_1 = in.nextInt();
                float fah_1 = ((cel_1 * 9) / 5) + 32;
                System.out.println(cel_1 + "°C in Fahrenheit is: " + fah_1 + "°F");
                break;
            default:
                System.out.println("The option you entered is not valid");
        }

        in.close();
    }
}
