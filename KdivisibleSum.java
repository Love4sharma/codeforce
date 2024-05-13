import java.util.*;

public class KdivisibleSum {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  if (k == 1) {
                        System.out.println(1);
                  } else if (n == k || n % k == 0) {
                        System.out.println(1);
                  } else if (n > k) {
                        int a = (int) Math.ceil((double) n / k);
                        int next = k * a;

                        System.out.println((int) Math.ceil((double) next / n));
                  } else {
                        System.out.println((int) Math.ceil((double) k / n));
                  }
            }
      }
}