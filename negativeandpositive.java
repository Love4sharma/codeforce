import java.util.*;

public class negativeandpositive {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  long sum = 0;
                  int neg = 0;
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                        if (arr[i] < 0) {
                              arr[i] = -arr[i];
                              neg++;
                        }
                        sum += arr[i];
                  }
                  Arrays.sort(arr);
                  if ((neg & 1) == 1) {
                        sum -= 2 * arr[0];
                  }
                  System.out.println(sum);

            }
      }
}
