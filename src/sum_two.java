import java.util.Scanner;

public class sum_two{
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = n / 2;
            int y = n - x;
            int sumX = sumOfDigits(x);
            int sumY = sumOfDigits(y);
            if (Math.abs(sumX - sumY) > 1) {
                x--;
                y++;
            }
            System.out.println(x + " " + y);
        }
    }
}
