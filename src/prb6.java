import java.io.*;
import java.util.*;

public class prb6 {
    static int N = 250000 + 5;
    static int n, q, u, v, w;
    static int head[] = new int[N << 1];
    static int e[] = new int[N << 1];
    static int ne[] = new int[N << 1];
    static int f[] = new int[N];
    static int cnt = 0;
    static int dep[] = new int[N];
    static int a[] = new int[N];
    static int qc[] = new int[N];
    static int qd[] = new int[N];
    static int qw[] = new int[N];

    static void add(int a, int b) {
        e[cnt] = b;
        ne[cnt] = head[a];
        head[a] = cnt++;
    }

    static void dfs(int u, int fa) {
        for (int i = head[u]; i != -1; i = ne[i]) {
            int v = e[i];
            if (v == fa)
                continue;
            dep[v] = dep[u] + 1;
            dfs(v, u);
            f[u] ^= f[v];
        }
    }

    static boolean judge(int u, int v, int w) {
        int t = 0;
        if (dep[u] > dep[v]) {
            t = u;
            u = v;
            v = t;
        }
        for (int i = 30; i >= 0; i--) {
            if (((w >> i) & 1) == 0)
                continue;
            boolean flag = false;
            for (int j = head[u]; j != -1; j = ne[j]) {
                int p = e[j];
                if (dep[p] <= dep[u] || (f[p] & (1 << i)) == 0)
                    continue;
                u = p;
                flag = true;
                break;
            }
            if (!flag)
                return false;
        }
        return u == v;
    }

    static void work() {
        Arrays.fill(head, -1);
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        q = cin.nextInt();
        for (int i = 1; i < n; i++) {
            u = cin.nextInt();
            v = cin.nextInt();
            add(u, v);
            add(v, u);
        }
        dep[1] = 1;
        dfs(1, -1);
        for (int i = 1; i <= q; i++) {
            qc[i] = cin.nextInt();
            qd[i] = cin.nextInt();
            qw[i] = cin.nextInt();
        }
        for (int i = 30; i >= 0; i--) {
            Arrays.fill(a, 0);
            for (int j = 1; j <= q;);
        }
    }
}
