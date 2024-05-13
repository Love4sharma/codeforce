import java.util.*;

public class divfourfive {

      public static int lowerBound(int[] arr, int n, int x) {
            int low = 0, high = n - 1;
            int ans = n;

            while (low <= high) {
                  int mid = (low + high) / 2;
                  // maybe an answer
                  if (arr[mid] >= x) {
                        ans = mid;
                        // look for smaller index on the left
                        high = mid - 1;
                  } else {
                        low = mid + 1; // look on the right
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  int q = sc.nextInt();
                  int a[] = new int[k];
                  int b[] = new int[k];
                  for (int i = 0; i < k; i++) {
                        a[i] = sc.nextInt();
                  }
                  for (int i = 0; i < k; i++) {
                        b[i] = sc.nextInt();
                  }
                  for (int i = 0; i < q; i++) {
                        int m = sc.nextInt();
                        int index = lowerBound(a, k, m);
                        // System.out.println("lower bound" + index);
                        if (a[index] == m) {
                              System.out.print(b[index] + " ");
                        } else {
                              if (index >= 1) {
                                    int total = b[index - 1];
                                    int r = a[index] - a[index - 1];
                                    double s = (double) (b[index] - b[index - 1]) / r;
                                    // System.out.println("speed is" + s);
                                    double c = (m - a[index - 1]) * s;
                                    System.out.print((int) (total + c) + " ");

                              } else {
                                    double s = (double) b[index] / a[index];
                                    System.out.print((int) (m * s) + " ");
                              }

                        }
                  }
                  System.out.println();
            }
      }
}
