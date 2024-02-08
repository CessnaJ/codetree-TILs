import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i, prod = 1;

        for (i = 1; i <= 10; i++) {
            prod *= i;

            if (prod >= a) {
                break;
            }
        }
        System.out.print(i);
    }
}