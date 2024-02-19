import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        char[] arr = new char[len/2];
        int index = 0; 
        for (int i = 0; i < len; i++) {
            if (i % 2 == 1) {
                arr[index++] = str.charAt(i);
            }
        }

        for (int j = arr.length -1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}