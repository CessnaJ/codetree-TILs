import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int temp = 0;
            for (int j = a; j <= b; j++) {
                if (j % 2 == 0) {
                    temp += j;
                }
            }
            System.out.println(temp);
        }
    }
}