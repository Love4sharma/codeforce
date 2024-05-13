import java.util.*;

public class ff {
      public static int gcd(int a, int b) {
            while (a > 0 && b > 0) {
                  if (a > b) {
                        a = a % b;
                  } else {
                        b = b % a;
                  }
            }
            if (a == 0) {
                  return b;
            }
            return a;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int x = sc.nextInt();
                  int ans = Integer.MIN_VALUE;
                  for (int i = 1; i < x; i++) {
                        if ((gcd(x, i) + i) > ans) {
                              ans = i;
                        }
                  }
                  System.out.println(ans);
            }
      }
}
