import java.util.Scanner;

public class arrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int array1[][] = new int[size][size];

        System.out.println("Enter the array elements");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        int array2[][] = new int[size][size];
        System.out.println("Enter the second array elements");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        int array3[][] = new int[size][size];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array3[i][j] = 0;
                for (int k = 0; k < array1.length; k++) {
                    array3[i][j] = array3[i][j] + (array1[i][k] * array2[k][j]);
                }
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.printf("[%d]",array3[i][j]);
            }
        }
    }
}
