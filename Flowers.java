import java.util.*;

public class Flowers {
      static int mod = 1000000007;

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int k = sc.nextInt();
            int dp[][] = new int[9][9];
            for (int arr[] : dp) {
                  Arrays.fill(arr, -1);
            }
            solve(8, 8, dp);
            while (t-- > 0) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();

                  int ans = 0;
                  for (int i = a; i <= b; i++) {
                        ans += dp[a][k] % mod;
                  }
                  System.out.println(ans % mod);
            }
      }

      public static int solve(int n, int k, int dp[][]) {
            if (n == 0) {
                  return 1;
            }
            if (n < 0) {
                  return 0;
            }
            if (dp[n][k] != -1) {
                  return dp[n][k] % mod;
            }
            return dp[n][k] = ((solve(n - k, k, dp) % mod + solve(n - 1, k, dp) % mod) + mod) % mod;
      }
}
