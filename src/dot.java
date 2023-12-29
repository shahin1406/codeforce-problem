import java.util.*;

public class dot {
    static final int mod = 1_000_000_007;
    static int n;
    static int[] x;
    static long[] fac;

    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        fac = new long[n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = fac[i - 1] * i % mod;
        }
        sc.close();
    }

    static int binom(int n, int k) {
        return (int) ((fac[n] * pow(fac[k], mod - 2) % mod) * pow(fac[n - k], mod - 2) % mod);
    }

    static long pow(long x, int y) {
        long res = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = res * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
        return res;
    }

    static int solve() {
        int[] cnt = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            for (int j = i - 1; j >= 0; j--) {
                if (x[j] < x[i] - (i - j)) {
                    break;
                }
                l = j;
            }
            for (int j = i + 1; j < n; j++) {
                if (x[j] > x[i] + (j - i)) {
                    break;
                }
                r = j;
            }
            cnt[r - l + 1]++;
        }
        for (int i = 2; i <= n; i++) {
            res = (int) ((res + (long) binom(n, i) * fac[i - 2] % mod * cnt[i]) % mod);
        }
        return res;
    }

    public static void main(String[] args) {
        init();
        System.out.println(solve());
    }
}
