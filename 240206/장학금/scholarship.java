import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int midtermExam = sc.nextInt();
        int finalExam = sc.nextInt();
        int ans = 0;
        if (midtermExam >= 90) {
            if (finalExam >= 95)
                ans = 100000;
            else if (finalExam >= 90)
                ans = 50000;
            else
                ans = 0;
        }
        System.out.println(ans);
    }
}