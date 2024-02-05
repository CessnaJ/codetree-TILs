import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		String ans;
		if (money >= 3000) {
			ans = "book";
		} else if (money >= 1000) {
			ans = "mask";
		} else if (money >= 500) {
			ans = "pen";
		} else {
			ans = "no";
		}
		System.out.println(ans);
	}
}