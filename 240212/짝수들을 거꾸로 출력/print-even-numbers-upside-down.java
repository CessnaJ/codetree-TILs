import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenCnt = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                arr[evenCnt++] = a;
            }
        }

        for (int j = evenCnt-1; j >= 0; j--) {
            System.out.printf("%d ", arr[j]);
        }
        
    }
}