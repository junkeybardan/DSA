import java.util.*;

public class largestAndSmallestInArray {
    public static int largest(int array[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i<array.length;i++){
            if (array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static int smallest(int array[]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i<array.length;i++){
            if (array[i]< smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i<arr.length;i++){
            System.out.println("Enter the element for " + i + "th index");
            arr[i] = sc.nextInt();
        }
        int largest = largest(arr);
        int smallest = smallest(arr);

        System.out.println("The largest element is: "+ largest + " and the smallest element is: "+smallest);

    }
}
