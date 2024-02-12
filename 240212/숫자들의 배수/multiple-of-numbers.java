import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[11];

        int cnt = 0;
        for (int i = 1; i <= 10; i++) {
            arr[i] = n * i;
            System.out.print(arr[i] + " ");
            if (arr[i] % 5 == 0) {
                cnt++;
            }
            if (cnt == 2) {
                break;
            }
        }
    }
}