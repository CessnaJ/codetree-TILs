import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3
        for (int i = n; i > 0; i--) { // 3 2 1
            for (int k = 2*(n-i); k > 0; k--) { // 0 2 4
                System.out.print(" ");
            }
            for (int j = i*2-1; j > 0; j--) { // 5
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}