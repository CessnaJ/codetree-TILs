import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        for (int i =0; i < 2; i++) {
            for (int j =0; j < 4; j++) {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }

        for (int i =0; i < 2; i++) {
            double rowAvg = 0.0;
            double rowTemp = 0.0;
            for (int j =0; j < 4; j++) {
                rowTemp += arr[i][j];
            }
            rowAvg = rowTemp / 4;
            System.out.printf("%.1f ", rowAvg);
        }
        System.out.println();

        for (int i =0; i < 4; i++) {
            double colAvg = 0.0;
            double colTemp = 0.0;
            for (int j =0; j < 2; j++) {
                colTemp += arr[j][i];
            }
            colAvg = colTemp / 2;
            System.out.printf("%.1f ", colAvg);
        }
        System.out.println();

        double avg = 0.0;
        double temp = 0.0;
        for (int i =0; i < 2; i++) {	
            for (int j =0; j < 4; j++) {
                temp += arr[i][j];
            }
        }
        System.out.printf("%.1f ", temp / 8);
    }
}