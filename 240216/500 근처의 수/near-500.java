import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1001];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            arr[num]++;
        }

        for (int idx = 499; idx > 0; idx--) {
            if (arr[idx] > 0) {
                System.out.print(idx + " ");
                break;
            }
        }

        for (int idx = 501; idx <= 1000; idx++) {
            if (arr[idx] > 0) {
                System.out.print(idx);
                break;
            }
        }
    }
}