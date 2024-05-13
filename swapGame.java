import java.util.*;

public class swapGame {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int a[] = new int[n];
                  int m = Integer.MAX_VALUE;

                  for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();

                        m = Math.min(m, a[i]);

                  }

                  if (a[0] > m)
                        System.out.println("Alice");
                  else
                        System.out.println("Bob");
            }

      }
}
