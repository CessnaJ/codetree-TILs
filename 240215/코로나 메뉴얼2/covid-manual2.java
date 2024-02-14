import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 3; i++) {
            char letter = sc.next().charAt(0);
            int num = sc.nextInt();
            if (letter == 'Y') {
                if (num >= 37) {
                    arr[0]++;
                } else {
                    arr[2]++;
                }
            } else {
                if (num >= 37) {
                    arr[1]++;
                } else {
                    arr[3]++;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print(arr[0] >= 2 ? "E" : "");
    }
}