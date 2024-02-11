import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            int n = sc.nextInt();
            arr[i] = n;
            if (n % 3 == 0) {
                break;
            }
        }
        System.out.println(arr[i-1]);
    }
}