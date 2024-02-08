import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        boolean repeat = true;
        while (repeat) {
            int width = sc.nextInt();
            int length = sc.nextInt();
            char character = sc.next().charAt(0);
            System.out.println(width * length);
            if (character == 'C') {
                break;
            }
        }
    }
}