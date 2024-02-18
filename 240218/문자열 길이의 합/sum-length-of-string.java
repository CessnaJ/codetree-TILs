import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        int cnt = 0;
        int cntStartsWithA = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
            cnt += arr[i].length();
            if (arr[i].charAt(0) == 'a') {
                cntStartsWithA++;
            }
        }
        System.out.printf("%d %d", cnt, cntStartsWithA);
    }
}