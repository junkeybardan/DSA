public class rev {
    public static void main(String[] args) {
        int num = 45670;
        int newNum = 0;
        while(num>0){
            int rev = num % 10;
            newNum = newNum * 10 + rev;
            num/=10;
        }
        System.out.println(newNum);
    }
}
