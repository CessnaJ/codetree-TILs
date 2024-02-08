import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int cnt = 0;
        int div;

        do {
        n /= i;
        i++;
        cnt++;
        } while (n > 1);
        System.out.print(cnt);
    }
}