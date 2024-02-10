import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // 1 2 3 4
            for (int j = n-i+1; j <= n; j++) { 
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}