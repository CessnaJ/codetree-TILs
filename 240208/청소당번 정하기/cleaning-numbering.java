import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int classroomCnt = 0;
        int aisleCnt = 0;
        int restroomCnt = 0;

        for (int i = 1; i <= n; i++) {
            
            if (i % 12 == 0) {
                restroomCnt += 1;
            } else if (i % 3 == 0) {
                aisleCnt += 1;
            } else if (i % 2 == 0) {
                classroomCnt += 1;
            }
        }
        System.out.printf("%d %d %d", classroomCnt, aisleCnt, restroomCnt);
    }
}