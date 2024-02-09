import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // 0 1 2 3 4
            // 1 3 5 7 9 규칙으로 별을 찍어야함.
            for (int j = 0; j < (2*i + 1); j++) {
                // 1 3 5 7 9 규칙으로 별을 찍어야함.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}