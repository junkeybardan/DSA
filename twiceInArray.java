import java.util.Scanner;

public class twiceInArray {
    public static boolean twice(int array[]){
        for (int i = 0; i<array.length;i++){
            for (int j = i+1; j<array.length;j++){
                if (array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
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
        boolean result = twice(arr);
        System.out.println(result);
    }
}
