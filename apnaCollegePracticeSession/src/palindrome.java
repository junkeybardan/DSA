import java.util.*;

public class palindrome {
    public static boolean palindromeOrNot(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        if (temp == rev) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to check pallindrome or not");
//        int num = sc.nextInt();
//        System.out.println(palindromeOrNot(num));

        for(int j = 1; j<=5; j++){
            for (int k = 5; k >=j; k--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
