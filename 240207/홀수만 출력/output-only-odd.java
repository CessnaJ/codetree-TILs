import java.util.Scanner;
  
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		for (int i=start; i<=end; i+=2) {
			if (i%2 ==1)
				System.out.printf("%d ", i);
        }
    }   
}