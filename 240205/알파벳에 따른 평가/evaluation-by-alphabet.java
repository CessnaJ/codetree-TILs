import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score = sc.next();
        String ans;

		switch (score) {
			case "S":
				ans = "Superior"; break;
			case "A":
				ans = "Excellent"; break;
			case "B":
				ans = "Good"; break;
			case "C":
				ans = "Usually"; break;
			case "D":
				ans = "Effort"; break;
			default:
				ans = "Failure";
		}
		System.out.println(ans);
    }
}