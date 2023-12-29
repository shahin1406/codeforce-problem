import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }

        System.out.println(maxLength);
    }
}
