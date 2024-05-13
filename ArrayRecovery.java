import java.util.*;

class ArrayRecovery {
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
                  ans[0] = arr[0];
                  boolean flag = true;
                  for (int i = 1; i < n; i++) {
                        int d = arr[i] + ans[i - 1];
                        if (d >= 0) {
                              ans[i] = d;
                        } else {
                              flag = false;
                              break;
                        }
                  }
                  if (flag == true) {
                        for (int i = 0; i < n; i++) {
                              System.out.print(ans[i] + " ");
                        }
                  } else {
                        System.out.print(-1);
                  }

                  System.out.println();
            }
      }
}
