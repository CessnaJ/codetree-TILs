import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i > 0; i--) {
            for (int k = n-i; k > 0; k--) {  // 0 2 4
                System.out.print("  ");
            }

            for (int j = 2*i-1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 2; i <= n ; i++) {
            for (int k = n-i; k > 0; k--) {  // 0 2 4
                System.out.print("  ");
            }

            for (int j = 2*i-1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}