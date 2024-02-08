import java.util.Scanner;

public class Main {
    public static boolean hasAnyUnsat(int a, int b, int element) {
        for (int i = a; i <= b; i++) {
            if (i % element == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean satisfies = false;

        if (a > b) {
            satisfies = !hasAnyUnsat(b, a, c);
        } else if (a < b) {
            satisfies = !hasAnyUnsat(a, b, c);
        } else {
            satisfies = !(a == c);
        }
        System.out.print(satisfies ? "YES" : "NO");
    }
}