import java.util.Scanner;

public class subArrays {

    public static void subArrays(int array[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i<array.length; i++){
            for (int j = i; j<array.length; j++){
                int sum = 0;
                for (int k = i; k<=j ; k++){
                    sum += array[k];
                    System.out.print( array[k] + " ");
                }
                System.out.print(" And the sum of this sub array is "+ sum);
                ts++;
                if (sum > maxSum){
                    maxSum = sum;
                }
                if (sum< minSum){
                    minSum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total num of sub arrays are "+ ts);
        System.out.println("The maximum sum is "+maxSum + " and minimum sum is "+ minSum);
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
        subArrays(arr);
    }
}
