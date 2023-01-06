import java.util.Scanner;

public class queAndAns {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sumOfOdd = 0, sumOfEven = 0;
        System.out.println("Enter the total number of integers");
        int testCase = sc.nextInt();
        for (int i = 1; i<=testCase; i++){
            System.out.println("Enter the number");
            int num = sc.nextInt();
            if (num %2 ==0){
                sumOfEven = sumOfEven + num;
            }
            else {
                sumOfOdd = sumOfOdd + num;
            }
        }
        System.out.println("Sum of odd is: " + sumOfOdd + " And sum of even is: "+ sumOfEven);
// 1 3 5 + 2 4

    }
}
