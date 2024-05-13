import java.util.*;

public class kefaandfirststep {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            int ans = Integer.MIN_VALUE;
            int c = 1;
            for (int i = 1; i < n; i++) {
                  if (arr[i] >= arr[i - 1]) {
                        c++;
                  } else {
                        ans = Math.max(c, ans);
                        c = 1;
                  }
            }
            ans = Math.max(c, ans);
            System.out.println(ans);
      }
}
