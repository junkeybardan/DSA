import java.util.Scanner;


public class sumOfDigits {

    public static int sum(int num){
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(sum(num));

    }

    }
