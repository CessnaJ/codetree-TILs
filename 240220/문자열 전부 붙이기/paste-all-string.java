import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String res = "";
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            arr[i] = str;
            res += str;
        }
        System.out.println(res);
    }
}