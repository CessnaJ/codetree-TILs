import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int str1Length = str1.length();
        String str2 = sc.next();
        int str2Length = str2.length();
        if (str1Length > str2Length) {
            System.out.printf("%s %d", str1, str1Length);
        } else if (str1Length < str2Length) {
            System.out.printf("%s %d", str2, str2Length);
        } else {
            System.out.printf("same");
        }
    }
}