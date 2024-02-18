import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (letter == arr[i].charAt(2) || letter == arr[i].charAt(3)) {
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}