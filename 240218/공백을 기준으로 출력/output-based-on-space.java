import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        arr[0] = sc.nextLine();
        arr[1] = sc.nextLine();
        char space = ' ';

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (space != arr[i].charAt(j)) {
                    System.out.print(arr[i].charAt(j));
                }
            }
        }
    }
}