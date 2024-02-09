import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3

        for (int i = 1; i <= n; i++) { // 1 2 3
            for (int j = n-i; j > 0; j--) { // 2 1 0
                System.out.print(" ");
            }
            for (int k = 2*i-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) { // 2 1
            for (int j = n-i; j > 0; j--) { 
                System.out.print(" ");
            }
            for (int k = 2*i-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}