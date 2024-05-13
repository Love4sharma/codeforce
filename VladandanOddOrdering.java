import java.util.*;

public class VladandanOddOrdering {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  ArrayList<Integer> list = new ArrayList<Integer>();

                  for (int i = 1; i <= n * n; i++) {

                        if (i % 2 != 0) {
                              list.add(i);
                        }
                  }
                  if (k <= n / 2) {
                        System.out.println(k - 1);
                  } else {
                        
                        int r =n%k;

                        int low = r;
                        int high = r * n;

                        while (low <= high) {
                              int mid = low + (high - low) / 2;
                              if (check(mid, n, list)) {
                                    System.out.println(mid);
                              }
                              else if()
                        }
                  }

            }
      }

      public static boolean check(int mid, int n, ArrayList<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                  if (list.get(i) * (i + 1) == mid) {
                        return true;
                  }
            }
            return false;
      }
}
