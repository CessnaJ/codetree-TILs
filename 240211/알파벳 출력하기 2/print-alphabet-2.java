import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print("  ");
                    continue;
                }
                
                System.out.print((char)((int)'A' + cnt) + " ");
                if (cnt == 25) {
                    cnt = 0;
                } else {
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}