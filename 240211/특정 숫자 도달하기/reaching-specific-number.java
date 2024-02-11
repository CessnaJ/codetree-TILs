import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) { // 배열에 담아보기
            int n = sc.nextInt();
            if (n >= 250) {
                break;
            }
            arr[i] = n;
            cnt++;
        }

        for (int j = 0; j < cnt; j++) { // 배열의 값을 누적합
            sum += arr[j];
        }
        System.out.printf("%d %.1f", sum, (double) sum / cnt);
    }
}