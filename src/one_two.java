import java.util.Scanner;

public class one_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    count1++;
                }
            }
            boolean flag = false;
            for (int i = 1; i < n; i++) {
                int count2 = count1 - a[i - 1];
                if (count2 == n - i) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}
