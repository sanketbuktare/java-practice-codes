import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_1[] = new int[100];
        int arr_2[] = new int[100];

        // For first array
        System.out.println("Enter size of first array (arr_1): ");
        int m = in.nextInt();
        System.out.println("Enter elements of first array (arr_1): ");
        for (int i = 0; i < m; i++) {
            arr_1[i] = in.nextInt();
        }

        // For second array
        System.out.println("Enter size of second array (arr_2): ");
        int n = in.nextInt();
        System.out.println("Enter elements of second array (arr_2): ");
        for (int i = 0; i < n; i++) {
            arr_2[i] = in.nextInt();
        }

        // Method 1 - General approach
        general(arr_1, m, arr_2, n);

        // Method 2 - Two pointer approach
        twoPointer(arr_1, m, arr_2, n);

        in.close();
    }

    public static void general(int arr_1[], int m, int arr_2[], int n) {
        System.out.println("\nIntersection of arr_1 and arr_2: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr_1[i] == arr_2[j]) {
                    System.out.print(arr_1[i] + "  ");
                    arr_2[j] = -11111;
                }
            }
        }
    }

    public static void twoPointer(int arr_1[], int m, int arr_2[], int n) {
        int i = 0;
        int j = 0;
        System.out.println("\nIntersection of arr_1 and arr_2: ");
        while (i < m && j < n) {
            if (arr_1[i] == arr_2[j]) {
                System.out.print(arr_1[i] + "  ");
                i++;
                j++;
            } else if (arr_1[i] < arr_2[j]) {
                i++;
            } else {
                j++;
            }

        }
    }

}
