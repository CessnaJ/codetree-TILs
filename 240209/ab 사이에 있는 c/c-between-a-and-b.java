import java.util.Scanner;

public class Main {
    public static boolean hasAnyMultiple(int a, int b, int element) {
        for(int i = a; i <= b; i++) {
            if (i %  element == 0) {
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


        boolean hasAny;
        if (a > b) {
            hasAny = hasAnyMultiple(b, a, c);
        } else if (a < b) {
            hasAny = hasAnyMultiple(a, b, c);
        } else {
            hasAny = (a == c);
        }
        System.out.println(hasAny ? "YES" : "NO");
    }
}