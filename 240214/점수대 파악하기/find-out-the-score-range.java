import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();
            if (n == 100) {
                arr[10]++;
            } else {
                arr[n/10]++;
            }
            
            if (n == 0) {
                break;
            }
        }

        for (int i = 10; i > 0; i--) {
            System.out.printf("%d - %d\n", i * 10, arr[i]);
        }
    }
}