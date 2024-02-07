import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multipleOf3Cnt = 0;
        int multipleOf5Cnt = 0;

        for (int i = 0; i < 10; i++) {
            int target = sc.nextInt();
            if (target % 3 == 0) {
                multipleOf3Cnt += 1;
            }
            if (target % 5 == 0) {
                multipleOf5Cnt += 1;
            }
        }
        System.out.printf("%d %d", multipleOf3Cnt, multipleOf5Cnt);
    }
}