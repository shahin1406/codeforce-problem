import java.util.Scanner;

public class shahin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int k = -1;
            for (int j = 1; j < n; j++) {
                int left = 1;
                int right = 1;
                for (int l = 0; l < j; l++) {
                    left *= a[l];
                }
                for (int l = j; l < n; l++) {
                    right *= a[l];
                }
                if (left == right) {
                    k = j;
                    break;
                }
            }
            System.out.println(k);
        }
    }
}
