import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // 41 32 23 14
            for (int k = n-i+1; k>0; k--) {
                System.out.print("* ");
            }
            System.out.println();
            
            for (int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}