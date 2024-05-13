import java.util.*;

public class SushiforTwo {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int v[] = new int[n];
            for (int i = 0; i < n; i++) {
                  v[i] = sc.nextInt();
            }
            int n1 = 0, n2 = 0, ans = 0, aux = 0;
            if (v[0] == 1) {
                  n1++;
            } else {
                  n2++;
            }
            for (int i = 1; i < n; i++) {
                  if (v[i] == 1) {
                        if (v[i - 1] == 2) {
                              n1 = 0;
                        }
                        n1++;
                  } else {
                        if (v[i - 1] == 1) {
                              n2 = 0;
                        }
                        n2++;
                  }
                  aux = Math.min(n1, n2);
                  ans = Math.max(ans, (aux * 2));
            }

            System.out.println(ans);

      }
}