import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int j = 0; j < q; j++) {
            int operation = sc.nextInt();
            
            if (operation == 1) {
                int targetA = sc.nextInt();
                System.out.println(arr[targetA - 1]);
            } else if (operation == 2) {
                int targetA = sc.nextInt();
                int index = 0;
                for (int k = 0; k < n; k++) {
                    if (arr[k] == targetA) {
                        index = k + 1;
                    }
                }
                System.out.println(index);
                
            } else if (operation == 3) {
                int targetA = sc.nextInt();
                int targetB = sc.nextInt();
                for (int k = targetA; k <= targetB; k++) {
                    System.out.printf("%d ", arr[k-1]);
                }
                System.out.println();
            }
        }
    }
}