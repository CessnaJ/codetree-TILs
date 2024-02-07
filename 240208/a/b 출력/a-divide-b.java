import java.util.Scanner;

/**
1차 오답 -> System.out.printf("%.20f", (float) a / b);
2차 생각하다가 철회 -> long a = (long) sc.nextInt() * 100000000000000000000l; 이용
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a / b);
        System.out.print(".");
        for (int i = 0; i < 20; i++) {
            a %= b;
            a *= 10;
            System.out.print(a / b);
        }
    }
}