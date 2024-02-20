import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        String sub = sc.next();

        int idx = given.indexOf(sub);
        if (idx != -1) {
            System.out.println(idx);
        } else {
            System.out.println("No");
        }
    }
}