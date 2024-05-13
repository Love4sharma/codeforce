import java.util.*;

public class RudolfandtheTicket {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int m = sc.nextInt();
                  int k = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  int nums[] = new int[m];
                  for (int i = 0; i < m; i++) {
                        nums[i] = sc.nextInt();
                  }
                  int c = 0;
                  for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                              if (arr[i] + nums[j] <= k) {
                                    c++;
                              }
                        }
                  }
                  System.out.println(c);
            }
      }
}
