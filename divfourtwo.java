import java.util.*;

public class divfourtwo {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  String s = sc.next();
                  Set<Character> set = new HashSet<>();
                  for (int i = 0; i < s.length(); i++) {
                        set.add(s.charAt(i));
                  }
                  if (set.size() == 1) {
                        System.out.println("NO");
                  } else {
                        System.out.println("YES");
                        String r = s.substring(1) + s.substring(0, 1);
                        System.out.println(r);
                  }
            }
      }
}
