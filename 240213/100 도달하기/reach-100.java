import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = sc.nextInt();
        System.out.printf("%d %d ", arr[0], arr[1]);
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.printf("%d ", arr[i]);
            if (arr[i] > 100) {
                break;
            }
        }
    }
}