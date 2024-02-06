import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char aSymtomp = sc.next().charAt(0);
        int aTemp = sc.nextInt();
        char bSymtomp = sc.next().charAt(0);
        int bTemp = sc.nextInt();
        char cSymtomp = sc.next().charAt(0);
        int cTemp = sc.nextInt();
        int cnt = 0;

        if (aSymtomp == 'Y' && aTemp >= 37) {
            cnt += 1;
        }

        if (bSymtomp == 'Y' && bTemp >= 37) {
            cnt += 1;
        }

        if (cSymtomp == 'Y' && cTemp >= 37) {
            cnt += 1;
        }

        if (cnt >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}