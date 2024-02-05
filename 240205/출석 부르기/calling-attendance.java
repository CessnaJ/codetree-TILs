import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans;

		switch (num) {
			case 1:
				ans = "John"; break;
			case 2:
				ans = "Tom"; break;
			case 3:
				ans = "Paul"; break;
			default:
				ans = "Vacancy";
		}
		System.out.println(ans);
    }
}