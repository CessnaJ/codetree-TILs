import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (3 > month) {
            System.out.println("Winter");
        } else if (3 <= month && month <= 5) {
            System.out.println("Spring");
        } else if (month < 9) {
            System.out.println("Summer");
        } else if (month < 12) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");	
        }
    }
}