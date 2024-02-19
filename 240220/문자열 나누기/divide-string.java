import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            res += sc.next();
        }

        for (int j = 0; j < res.length(); j++) {
            if (j % 5 == 0 && j != 0) {
                System.out.println();
            }
            System.out.print(res.charAt(j));
        }
    }
}