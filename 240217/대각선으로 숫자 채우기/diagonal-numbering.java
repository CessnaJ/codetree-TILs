import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int cnt = 1;

        for (int j = 0; j < m; j++) {
            int r = 0, c = j;
            
            while (0 <= r && r < n && 0 <= c && c < m) {
                arr[r][c] = cnt++;
                r++; c--;
            }
        }

        for (int i = 1; i < n; i++) {
            int r = i, c = n-1;
            while (0 <= r && r < n && 0 <= c && c < m) {
                arr[r][c] = cnt++;
                r++; c--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}