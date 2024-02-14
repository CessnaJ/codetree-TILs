import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char letterToFind = sc.next().charAt(0);

        int index = -1;
        for (int i = 0; i < letters.length; i++) {
            if (letterToFind == letters[i]) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("None");
        } else {
            System.out.println(index);
        }
    }
}