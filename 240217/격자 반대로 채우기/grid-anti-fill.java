import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int cnt = 1;
        for (int i = n-1; i >= 0; i--) { // col
            if ((n-i) % 2 == 1) { // upward
                for (int j = n-1; j >= 0; j--) { // row
                    arr[j][i] = cnt++;
                }
            } else { // downward
                for (int j = 0; j < n; j++) { // row
                    arr[j][i] = cnt++;
                }
            }
        }
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}