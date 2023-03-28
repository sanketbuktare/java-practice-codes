import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = in.nextInt();

        int arr[] = new int[100];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the key you want to search");
        int key = in.nextInt();

        boolean isPresent = search(arr, size, key);

        System.out.println(isPresent ? "Key is Present" : "Key is NOT Present");

        in.close();
    }

    public static boolean search(int arr[], int n, int key) {

        for(int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        
        return false;
    }
}
