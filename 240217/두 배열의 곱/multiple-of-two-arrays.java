import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();
                arr1[i][j] = num;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();
                arr2[i][j] = num;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arr1[i][j] * arr2[i][j]);
            }
            System.out.println();
        }
    }
}