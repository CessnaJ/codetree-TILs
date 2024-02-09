import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j < n; j++) { // col
                if (i == 0 || i == n-1 || j == 0 || j == n-1) { // 테두리
                    System.out.print("* ");
                } 
                else if (i > j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}