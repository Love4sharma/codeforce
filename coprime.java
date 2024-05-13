import java.util.*;

public class coprime {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  int ans = Integer.MIN_VALUE;
                  for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                              int g = gcd(arr[i], arr[j]);
                              ans = Math.max(ans, g);
                        }
                  }
                  System.out.println(ans);
            }
      }

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
}
