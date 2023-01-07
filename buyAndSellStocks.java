import java.util.Scanner;

public class buyAndSellStocks {
    public static void shareValue(int arr[]){
        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i<arr.length;i++){
            if (buyPrice< arr[i]){
                int profit = arr[i] - buyPrice ; // profit for the day
                maxProfit = Math.max(profit, maxProfit); // calculating maximum profit
            }
            else{
                buyPrice = arr[i]; // if sp is less than cp, changing the buying price to minimum value to earn more in coming days..
            }
        }
        System.out.println("The maximum profit earned is: " + maxProfit);
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
        shareValue(arr);
    }
}
