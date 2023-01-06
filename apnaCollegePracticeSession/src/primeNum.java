import java.util.*;

public class primeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("Number is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
