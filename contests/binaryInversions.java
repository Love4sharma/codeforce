import java.util.*;

public class binaryInversions {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }

                  int ans[] = new int[n];
                  int c = 0;
                  for (int i = n - 1; i >= 0; i--) {
                        if (arr[i] == 0) {
                              c++;
                        }
                        ans[i] = c;
                  }
                  int total = 0;
                  for (int i = 0; i < n; i++) {
                        if (arr[i] == 1) {
                              int f = ans[i];
                              total += f;
                        }
                  }

            }
      }
}
