import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        String strToMatch = sc.next();
        int givenLen = given.length();
        int cnt = 0;

        for (int i = 0; i < givenLen-1; i++) {
            if (given.charAt(i) == strToMatch.charAt(0) && given.charAt(i+1) == strToMatch.charAt(1)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}