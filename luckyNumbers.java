import java.util.*;

public class luckyNumbers {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean f = false;
            for (int i = 1; i <= n; i++) {
                  if (constains(i)) {
                        if (n % i == 0) {
                              f = true;
                              break;
                        }
                  }
            }
            if (f) {
                  System.out.println("YES");
            } else {
                  System.out.println("NO");
            }
      }

      public static boolean constains(int n) {
            while (n != 0) {
                  int r = n % 10;
                  if (r != 4 && r != 7) {
                        return false;
                  }
                  n = n / 10;
            }
            return true;
      }
}