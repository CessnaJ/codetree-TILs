import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int letterLen = sc.nextInt();

        for (int i = str.length()-1; i >= str.length() - letterLen; i--) {
            System.out.print(str.charAt(i));
            if (i == 0) {
                break;
            }
        }
    }
}