import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int birthYearMonthDay = sc.nextInt();
        int identifier = sc.nextInt();
        System.out.printf("%d%d", birthYearMonthDay, identifier);
    }
}