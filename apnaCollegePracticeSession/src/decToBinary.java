import java.util.Scanner;

public class decToBinary {
    public static int pow(int num, int pow){
        int power = 1;
        for (int i = 1; i<=pow ; i++){
            power = num * power;
        }
        return power;
    }
    public static  void decToBin(int n){
        int binary = 0, power = 0;
        while (n>0){
            int rem = n%2;
            binary = binary +( rem *pow(10, power));
            power++;
            n = n/2;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal num");
        int dec = sc.nextInt();
        decToBin(dec);
    }
}
