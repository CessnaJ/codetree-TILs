import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inc = n;
        for (int i=0; i<5; i++) {
            System.out.printf("%d ", n);
            n += inc;
        }
    }
}