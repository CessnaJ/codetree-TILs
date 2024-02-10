import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { // 1 2 3 4
                if (i % 2 == 1) {
                    System.out.printf("%d ", ++cnt);
                } else {
                    cnt += 2;
                    System.out.printf("%d ", cnt);
                }
            }
            System.out.println();
        }
    }
}