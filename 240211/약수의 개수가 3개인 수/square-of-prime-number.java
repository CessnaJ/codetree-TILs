import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;
        int temp;

        for (int i = start; i <= end; i++) {
            temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp ++;
                }
            }
            if (temp == 3) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}