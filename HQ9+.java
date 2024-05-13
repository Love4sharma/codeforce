import java.util.*;

public class HQ9+{

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int n1 = s.indexOf('H');
            int n2 = s.indexOf('Q');
            int n3 = s.indexOf('9');
            int n4 = s.indexOf('+');
            if (n1 != -1 || n2 != -1 || n3 != -1 || n4 != -1) {
                  System.out.println("YES");
            } else {
                  System.out.println("NO");
            }
      }
}
