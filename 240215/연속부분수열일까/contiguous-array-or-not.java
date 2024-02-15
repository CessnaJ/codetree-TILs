import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1Length = sc.nextInt();
        int n2Length = sc.nextInt();
        int[] n1 = new int[n1Length];
        int[] n2 = new int[n2Length];

        for (int i = 0; i < n1Length; i++) {
            int num = sc.nextInt();
            n1[i] = num;
        }

        for (int j = 0; j < n2Length; j++) {
            int num = sc.nextInt();
            n2[j] = num;
        }

        boolean hasSubSequence = false;
        for (int i = 0; i < n1Length; i++) {
            boolean isSubSequence = true;
            int index = 0;
            if (i + n2Length > n1Length) {
                break;
            }
            while (index < n2Length) {
                if (n1[i + index] != n2[index]) {
                    isSubSequence = false;
                    break;
                }
                index++;
            }
            if (isSubSequence) {
                hasSubSequence = true;
                break;
            }
        }
        System.out.println(hasSubSequence ? "Yes" : "No");
    }
}