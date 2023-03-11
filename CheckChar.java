
// program to check if the given char is Capital, Small, Numeric or Special character
import java.util.*;

public class CheckChar {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        char n = in.next().charAt(0);
        int asci_n = n;
        // System.out.println(asci_n);
        if (asci_n >= 65 && asci_n <= 65 + 26) {
            System.out.println("Capital Alphabet");
        } else if (asci_n >= 97 && asci_n <= 97 + 26) {
            System.out.println("Small Alphabet");
        } else if (asci_n >= 48 && asci_n <= 57) {
            System.out.println("Numeric");
        } else {
            System.out.println("Special Charater");
        }
        in.close();
    }
}
