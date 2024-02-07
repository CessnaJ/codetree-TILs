import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i+=0) { // while문으로 해도 되는데, for 안의 if라고 타이틀이 되어있음.
            System.out.printf("%d ", i);
            if (i % 2 == 1) {
                i *= 2;
            } else {
                i += 3;
            }
        }
    }
}