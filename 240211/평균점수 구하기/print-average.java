import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[8];

        for (int i = 0; i < 8; i++) {
            double score = sc.nextDouble();
            arr[i] = score;
        }

        double sum = 0.0;
        for (int i = 0; i < 8; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / 8;
        System.out.printf("%.1f", avg);
    }
}