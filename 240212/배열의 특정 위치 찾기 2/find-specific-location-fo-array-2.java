import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int oddIdxSum = 0;
        int evenIdxSum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                oddIdxSum += arr[i];
            } else {
                evenIdxSum += arr[i];
            }
        }

        System.out.print(oddIdxSum - evenIdxSum > 0 ? oddIdxSum - evenIdxSum : evenIdxSum - oddIdxSum);
    }
}