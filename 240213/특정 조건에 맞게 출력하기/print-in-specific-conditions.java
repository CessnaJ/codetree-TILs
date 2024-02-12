import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            } else {
                cnt++;
            }
        }

        for (int j = 0; j < cnt; j++) {
            if (arr[j] % 2 == 1) {
                System.out.printf("%d ", arr[j] + 3);
            } else {
                System.out.printf("%d ", arr[j] / 2);
            }
        }
    }
}