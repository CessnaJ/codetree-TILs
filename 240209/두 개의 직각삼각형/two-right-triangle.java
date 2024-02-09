import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3 -> 3003 / 2112 / 1221

        for (int i = n; i > 0; i--) { // 3 2 1
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (int k = n-i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = n-i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}