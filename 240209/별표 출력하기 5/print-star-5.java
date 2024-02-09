import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) { // i => 4 3 2 1
            for (int j = 0; j < i; j++) { // i/j => 4/4 4 4 4
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
                // python처럼 *연산자로 concat 지원하지 않음.
		        // string.repeat(int)도 java11부터 지원한다.
            }
            System.out.println();
        }
    }
}