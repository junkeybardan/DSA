import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static int search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element for " + i + "th index");
            arr[i] = sc.nextInt();
        }
        System.out.println("Please enter the element to search");
        int key = sc.nextInt();
        int search = search(arr, key);
        if (search == -1) {
            System.out.println("Element " + key + " not found in the list");
        } else {
            System.out.println("Element " + key + " found in " + search + "th index");
        }
    }
}
