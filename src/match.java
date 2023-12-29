import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class match {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine().trim());
            if (n % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                for (int j = 1; j <= n; j++) {
                    System.out.println(j + " " + (j + n));
                }
            }
        }
    }
}
