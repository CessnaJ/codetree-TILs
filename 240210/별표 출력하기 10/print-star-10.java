import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // 14 23 32 41
            for (int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = n-i+1; k>0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}