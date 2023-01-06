public class floydsTrianglePattern {
    public static void pattern(int n){
        int val = 1;
        for (int i = 1; i<=n;i++){

            for(int j = 1; j<=i;j++){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
