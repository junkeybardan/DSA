public class chap_13_patterns {
    public static void main(String[] args) {
//        char a = 'A';
//        for (int i = 1; i<=4;i++){
//            for (int j = 1; j<=i;j++){
//                System.out.print(a);
//                a++;
//
//            }
//            System.out.println();
//        }

        for (int i = 1; i<=5;i++){
            for (int j = 1; j<=i; j++){
                if( j%2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
    }
}
