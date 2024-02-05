import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		String ans;
		if (temp < 0) {
			ans = "ice";
		} else if (temp >= 100) {
			ans = "vapor";
		} else {
			ans = "water";
		}
		System.out.println(ans);
	}
}