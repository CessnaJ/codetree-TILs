import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int cnt = 0;

        int i = 1;
        while (true) {
            prod *= i;
            cnt++;
            i++;
            if (prod > n) {
                break;
            }
        }
        System.out.println(cnt);
    }
}