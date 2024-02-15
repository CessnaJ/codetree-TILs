import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        int minVal = INT_MAX;
        int maxVal = INT_MIN;
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if (a == 999 || a == -999) {
                break;
            }
            
            // arr[i] = a;
            if (minVal > a) {
                minVal = a;
            }
            
            if (maxVal < a) {
                maxVal = a;
            }
        }
        System.out.printf("%d %d", maxVal, minVal);
    }
}