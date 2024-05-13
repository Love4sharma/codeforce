import java.util.*;

public class dragons {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long s = sc.nextLong();
            int n = sc.nextInt();
            int arr[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                  arr[i][0] = sc.nextInt();
                  arr[i][1] = sc.nextInt();
            }
            Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                  if (s > arr[i][0]) {
                        s += arr[i][1];
                  } else {
                        flag = false;
                        break;
                  }
            }
            if (flag) {
                  System.out.println("YES");
            } else {
                  System.out.println("NO");
            }
      }
}
