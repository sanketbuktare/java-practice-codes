import java.util.*;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int arr[] = new int[100];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int unique = checkUnique(arr, size);
        System.out.println("Unique element is: "+ unique);

        in.close();
    }

    public static int checkUnique(int arr[], int n) {

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }

        return ans;
    }
}
