import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxVal = -1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (maxVal < num) {
                boolean hasAnother = false; 
                for (int j = 0; j < n; j++) {
                    if (arr[j] == num && i != j) {
                        hasAnother = true;
                        break;
                    }
                }
                if (!hasAnother) {
                    maxVal = num;
                }
            }
        }

        System.out.println(maxVal);
    }
}