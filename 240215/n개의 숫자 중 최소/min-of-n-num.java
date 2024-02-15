import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        int minVal = INT_MAX;
        int maxVal = INT_MIN;


        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            if (minVal > a) {
                minVal = a;
            }
            
            if (maxVal < a) {
                maxVal = a;
            }
        }

        int minCnt = 0;
        int maxCnt = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == minVal) {
                minCnt++;
            }
            
            if (arr[j] == maxVal) {
                maxCnt++;
            }
        }
        System.out.printf("%d %d", minVal, minCnt);
    }
}