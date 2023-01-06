public class invertedAndRotatedHalfPyramid {
    public static void pattern(int n){
        for (int row = 1; row<=n; row++){
            for (int col = row; col<=n-row ; col++){
                System.out.print(" ");
            }
            for (int star = 1; star<=row ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
