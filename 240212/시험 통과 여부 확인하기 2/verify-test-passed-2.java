import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];
        int cnt = 0;

        for (int k = 0; k < n; k++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int score = sc.nextInt();
                sum += score;
            }
            
            if (sum / 4 >= 60) {
                System.out.print("pass\n");
                cnt++;
            } else {
                System.out.print("fail\n");
            }
        }
        System.out.print(cnt);
    }
}