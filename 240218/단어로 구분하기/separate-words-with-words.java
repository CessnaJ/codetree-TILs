import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strLine = sc.nextLine();

        for (int i = 0; i < strLine.length(); i++) {
            char letter = strLine.charAt(i);
            if (letter == ' ') {
                System.out.println();
            } else {
                System.out.print(letter);
            }
        }
    }
}