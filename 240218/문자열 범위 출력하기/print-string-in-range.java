import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strWithSpace = sc.nextLine();
        for (int i =2; i < 10; i++) {
            System.out.print(strWithSpace.charAt(i));
        }

    }
}