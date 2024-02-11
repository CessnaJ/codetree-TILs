import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        
        double sumOfMultiplesOf3 = 0.0;
        int cntOfMultiplesOf3 = 0;

        for (int j = 0; j < 10; j++) {
            if (j % 2 == 1) {
                evenSum += arr[j];
            }
            
            if ((j+1) % 3 == 0) {
                sumOfMultiplesOf3 += arr[j];
                cntOfMultiplesOf3++;
            }
        }

        System.out.printf("%d %.1f", evenSum, sumOfMultiplesOf3/cntOfMultiplesOf3);
    }
}