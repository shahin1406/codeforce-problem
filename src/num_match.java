import java.util.*;

public class num_match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " " + (n + i));
            }
        }
    }
}