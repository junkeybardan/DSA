import java.util.Map;
import java.util.Scanner;

public class maxInArray {
    public static void max(int array[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        boolean flag = false;
        for (int i = 0; i<array.length; i++){

            currentSum = currentSum + array[i];
            if (currentSum<0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
//            if (maxSum>=currentSum){
//                maxSum = currentSum;
//            }
        }

        System.out.println("The maximum sum is "+maxSum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element for " + i + "th index");
            arr[i] = sc.nextInt();
        }
        max(arr);
    }
}
