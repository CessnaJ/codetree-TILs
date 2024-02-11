import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            if (num == 0) {
                break;
            }
            cnt++;
        }

        int evenSum = 0;
        int evenCnt = 0;
        for (int j = cnt-1; j >= 0; j--) {
            if (arr[j] % 2 == 0) {
                evenCnt++;
                evenSum += arr[j];
            }
        }
        System.out.printf("%d %d", evenCnt, evenSum);
    }
}