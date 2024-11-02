import java.util.*;

public class GuesstheMaximum {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  int minValue = Integer.MAX_VALUE;
                  for (int num : arr) {
                        if (num < minValue) {
                              minValue = num;
                        }
                  }
                  System.out.println(minValue - 1);
            }
      }
}
