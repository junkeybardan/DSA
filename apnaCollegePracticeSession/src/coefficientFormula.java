import java.util.Scanner;

public class coefficientFormula {

    public static double coefficient(int r, int n){
        double factR = 1, factN=1 , factNR = 1;
        int a = n-r;

        for (int i = 1; i<=a;i++){
            factNR = factNR * i;
        }

        for (int i = 1; i<=n;i++){
            factN = factN * i;
        }
        for (int i = 1; i<=r;i++){
            factR = factR * i;
        }

        return ((factN)/ (factR * (factNR)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println("Enter the value of r");
        int r = sc.nextInt();

        double coefficientVal = coefficient(r,n);
        System.out.println(coefficientVal);
    }
}
