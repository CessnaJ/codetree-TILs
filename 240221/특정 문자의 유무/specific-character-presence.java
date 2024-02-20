import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        boolean containsEE = given.contains("ee");
        boolean containsAB = given.contains("ab");
        System.out.print(containsEE ? "Yes " : "No ");
        System.out.print(containsAB ? "Yes" : "No");
    }
}