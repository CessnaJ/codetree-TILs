import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = sc.nextInt();

        while (num > 0) {
            arr[num % div]++;
            num /= div;
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i] * arr[i];
        }
        System.out.println(sum);
    }
}