import java.util.*;

public class MovingChips {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int ans[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        ans[i] = sc.nextInt();
                  }
                  int count = 0;
                  int l = 0;
                  int r = n - 1;
                  for (int i = 0; i < n; i++) {
                        if (ans[i] == 1) {
                              l = i;
                              break;
                        }
                  }
                  for (int i = n - 1; i >= 0; i--) {
                        if (ans[i] == 1) {
                              r = i;
                              break;
                        }
                  }
                  for (int i = l; i <= r; i++) {
                        if (ans[i] == 0) {
                              count++;
                        }
                  }
                  System.out.println(count);
            }
      }
}
