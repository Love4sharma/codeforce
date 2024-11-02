public class RegularExpressionMatching {
      public static void main(String[] args) {
            String s = "mississippi";
            String p = "mis*is*p*.";
            boolean ans = isMatch(s, p);
            System.out.println(ans);
      }

      public static boolean isMatch(String s, String p) {
            return solve(s, p, 0, s.length(), p.length(), 0);
      }

      public static boolean solve(String s, String p, int i, int n, int m, int j) {
            if (i >= n) {
                  return true;
            }
            if (j >= m) {
                  return false;
            }
            boolean ans = true;
            if (p.charAt(j) == '.') {
                  ans = solve(s, p, i + 1, n, m, j + 1);
            } else if (p.charAt(j) == '*' && p.charAt(j - 1) == '.') {
                  ans = solve(s, p, i + 1, n, m, j + 1);
            } else if (p.charAt(j) == '*' && Character.isLetter(p.charAt(j - 1))) {
                  if (s.charAt(i) == p.charAt(j - 1)) {
                        ans = solve(s, p, i + 1, n, m, j + 1);
                  }
                  // else{
                  // return false;
                  // }
            } else if (Character.isLetter(p.charAt(j))) {
                  if (s.charAt(i) == p.charAt(j)) {
                        ans = solve(s, p, i + 1, n, m, j + 1);
                  }
                  // else{
                  // return false;
                  // }
            } else {
                  ans = solve(s, p, i, n, m, j + 1);
            }
            return ans;
      }
}
