import java.util.*;

public class puzzles {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[m];
            for (int i = 0; i < arr.length; i++) {
                  arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int ans = Integer.MAX_VALUE;
            int i = 0;
            int j = n - 1;
            while (i < m && j < m) {
                  ans = Math.min(arr[j] - arr[i], ans);
                  i++;
                  j++;
            }
            System.out.println(ans);
      }
}