import java.util.Scanner;

public class pairsInArray {
    public static void pairs(int array[]){
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                System.out.print("( " + array[i] + "," + array[j] + " )" );
            }
            System.out.println();
        }
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
        pairs(arr);
    }
}
