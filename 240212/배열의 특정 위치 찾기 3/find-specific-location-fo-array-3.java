import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int stopIndex = 0;

        int i;
        for (i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }

        int sum = 0;
        for (int j = i-1; j > i-4; j--) {
            sum += arr[j];
        }
        System.out.println(sum);
    }
}