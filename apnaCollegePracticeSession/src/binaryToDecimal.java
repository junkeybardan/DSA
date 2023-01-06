import java.util.*;
public class binaryToDecimal {
public static int pow(int num, int pow){
    int power = 1;
    for (int i = 1; i<=pow ; i++){
        power = num * power;
    }
    return power;
}
public static void binToDec(int n){
    int power = 0, decimal = 0;
    while (n>0){
        int lastDigit = n%10;
        decimal = decimal+ (lastDigit * pow(2,power));
        power++;
        n = n/10;
    }
    System.out.println(decimal);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary num");
        int bin = sc.nextInt();
        binToDec(bin);
    }
}
