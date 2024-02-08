import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i, sum = 0;

        for (i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= a) {
                break;
            }
        }
        System.out.print(i);
    }
}