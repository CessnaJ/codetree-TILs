import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // 0 1 2
            for (int j = n-i; j <= n; j++) { // 2 1 0
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}