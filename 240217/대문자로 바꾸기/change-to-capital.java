import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] charArr = new char[5][3];

        for (int i =0; i < 5; i++) {
            for (int j =0; j < 3; j++) {
                int num = (int) sc.next().charAt(0);
                char element = (char) (num - 32);
                charArr[i][j] = element;
                System.out.printf("%s ", element);
            }
            System.out.println();
        }
    }
}