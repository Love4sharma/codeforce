
import java.util.*;

public class divFourfour {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  String s = sc.next();
                  int n = s.length();
                  int c = 1;
                  int temp = 0;
                  for (int i = 1; i < n; i++) {
                        if (s.charAt(i) == s.charAt(i - 1)) {
                              continue;
                        } else {
                              c++;

                        }
                        if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') {
                              temp = 1;
                        }
                  }
                  System.out.println(c - temp);
            }

      }

}
