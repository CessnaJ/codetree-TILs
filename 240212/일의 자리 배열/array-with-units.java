import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for (int i = 0; i < 8; i++) {
            arr[i+2] = (arr[i] + arr[i+1]) % 10;
        }

        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}