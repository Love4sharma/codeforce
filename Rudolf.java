import java.util.*;

public class Rudolf {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  int sum = 0;
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                        sum += arr[i];
                  }
                  if (sum == 0) {
                        System.out.println("YES");
                  }
                  int c = 1;

                  while (c <= n - 2) {
                        if (arr[c] == 0) {
                              c++;
                              continue;
                        } else {
                              int k = arr[c] / 2;

                        }
                  }

            }
      }
}
