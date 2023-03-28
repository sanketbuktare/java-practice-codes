import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[100];
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        System.out.println("Enter the array elements (sorted in ascending order): ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the key you want to search: ");
        int key = in.nextInt();

        int ans = binarySearch(arr, size, key);
        if (ans != -1) {
            System.out.println("The key is found at index " + ans);
        } else {
            System.out.println("The key is NOT present");
        }

        in.close();
    }

    public static int binarySearch(int arr[], int n, int key) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }
}
