import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3

        for (int i = 1; i <= n; i++) { // 1 2 3
            for (int k = 2*(n-i); k > 0; k--) { // 4 2 0
                System.out.print(" ");
            }
            for (int j = i*2-1; j > 0; j--) { // 1 3 5
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}