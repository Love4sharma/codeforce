import java.util.*;

public class twins {
      public static void main(String[] args) {
            int n = sc.nextInt();
            int sum = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
                  sum += arr[i];
            }
            Arrays.sort(arr);
            int c = 0;
            int money = 0;
            for (int i = n - 1; i >= 0; i--) {
                  sum -= arr[i];
                  money += arr[i];
                  c++;
                  if (money > sum) {
                        break;
                  }
            }
            System.out.println(c);
      }
}