import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		double heightMeter = (double) height / 100;
		int bmi = (int) (weight / (heightMeter * heightMeter));
		System.out.println(bmi);
        if (bmi >= 25) {
            System.out.println("Obesity");
        }
	}
}