import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j < n; j++) {
                System.out.print((char)((int)'A' + cnt++));
            }
            System.out.println();
        }
    }
}