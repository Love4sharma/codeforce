import java.util.*;

public class hi {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int m = sc.nextInt();
                  String s = sc.next();
                  String s1 = sc.next();
                  int j = 0;
                  int ans = 0;
                  for (int i = 0; i < m && j < n; ++i) {
                        if (s1.charAt(i) == s.charAt(j)) {
                              ++j;
                              ++ans;
                        }
                  }
                  System.out.println(ans);

            }
      }
}
