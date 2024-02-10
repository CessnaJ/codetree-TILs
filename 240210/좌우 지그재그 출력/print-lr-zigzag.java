import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int anchor = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                anchor += 2*n;
            }
            
            for (int j = 1; j <= n; j++) { // 1 2 3 4 
                if (i % 2 == 1) {
                    System.out.printf("%d ", anchor + j -1);
                } else {
                    System.out.printf("%d ", anchor - j);
                }
            }
            System.out.println();
        }
    }
}