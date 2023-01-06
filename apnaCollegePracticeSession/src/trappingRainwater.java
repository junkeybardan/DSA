import java.util.*;

public class trappingRainwater {
    public static void trappedAmtWater(int block[]) {
        // ----------------------------------------------------------
        int maxLeftArray[] = new int[block.length];
        maxLeftArray[0] = block[0];
        for (int i = 1; i < block.length; i++) {
            maxLeftArray[i] = Math.max(block[i], maxLeftArray[i - 1]);
        }
        for (int i = 0; i < maxLeftArray.length; i++) {
//            System.out.print(maxLeftArray[i]);
        }
        // ----------------------------------------------------------
        int maxRightArray[] = new int[block.length];
        maxRightArray[maxRightArray.length - 1] = block[block.length - 1];
        for (int i = block.length - 2; i >= 0; i--) {
            maxRightArray[i] = Math.max(maxRightArray[i + 1], block[i]);
        }
        for (int i = 0; i < block.length; i++) {
//            System.out.print(maxRightArray[i]);
        }
        int trappedWaterLvl = 0;
        for (int i = 0; i < block.length; i++) {
            if (block[i] < 0) {
                System.out.println("No negative numbers are allowed");
                break;
            }
            if (block.length < 2) {
                System.out.println("There must be atleast 3 buildings or blocks for the water to be stored");
            }
            trappedWaterLvl += (Math.min(maxRightArray[i], maxLeftArray[i]) - block[i]);
        }
        System.out.println(trappedWaterLvl);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Do not enter the sorted array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element for " + i + "th index");
            arr[i] = sc.nextInt();
        }
        trappedAmtWater(arr);
    }
}
