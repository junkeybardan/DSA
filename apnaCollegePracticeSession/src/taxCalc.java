import java.util.Scanner;

public class taxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tax = 0;
        System.out.println("enter your income");
        int inc = sc.nextInt();

        if(inc <= 500000){
            System.out.println("No tax required");
        }
        else if (inc >=500000 || inc <=10_00000){
            tax = 0.2 * inc;
            System.out.println("Your total tax amount is : " + tax);
        }
        else {
            tax = 0.3 * inc;
            System.out.println("Your total tax amount is : " + tax);
        }
    }
}
