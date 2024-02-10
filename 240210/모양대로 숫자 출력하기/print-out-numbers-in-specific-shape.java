import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // 1 2 3
            for (int j = n; j > 0; j--) { // 3 2 1
                if (n-j+1 >= i) {
                    System.out.printf("%d ", j);
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }
}