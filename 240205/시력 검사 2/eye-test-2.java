import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double eyeSight = sc.nextDouble();
		String ans;
		if (eyeSight >= 1.0) {
			ans = "High";
		} else if (eyeSight >= 0.5) {
			ans = "Middle";
		} else {
			ans = "Low";
		}
		System.out.println(ans);
	}
}