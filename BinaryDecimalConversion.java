import java.util.*;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to convert?\n1. Decimal to Binary\n2. Binary to Decimal");
        int option = in.nextInt();

        switch (option) {
            case 1:
                String deci = returnNum();
                int num = Integer.parseInt(deci);
                int temp = num;
                List<String> list = new ArrayList<>();
                while (temp != 0) {
                    list.add((temp % 2) + "");
                    temp = temp / 2;
                }
                Collections.reverse(list);
                String answer = String.join("", list);
                System.out.println("Binary equivalent of " + num + " is " + answer);
                break;
            case 2:
                String bin = returnNum();
                int sum = 0;
                for (int i = 0; i < bin.length(); i++) {
                    int c = (bin.charAt(i)) - '0';
                    sum = sum + (c * (int) (Math.pow(2, bin.length() - i - 1)));
                    // System.out.print(bin.charAt(i) + "  "  + c + "  " + sum + "\n");
                }
                System.out.println("Decimal equivalent of " + bin + " is " + sum);
                break;
            default:
                System.out.println("Please enter valid option");
                break;
        }

        in.close();
    }

    public static String returnNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        String num = in.nextLine();
        in.close();
        return num;
    }
}
