import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        char letter = sc.next().charAt(0);
        int cnt = 0;
        int totalLen = 0;
        double avg = 0.0;

        for(int j = 0; j < n; j++) {
            if (arr[j].charAt(0) == letter) {
                cnt++;
                totalLen += arr[j].length();
            }
        }
        System.out.printf("%d %.2f", cnt, (double) totalLen / cnt);
    }
}