import java.util.Scanner;

public class ProductofBinaryDecimals {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();

            while (tc-- > 0) {
                  int n = sc.nextInt();

                  if (isBinary(n)) {
                        System.out.println("YES");
                  } else {
                        System.out.println(solve(n));
                  }
            }
      }

      public static boolean isBinary(int num) {

            String numStr = Integer.toString(num);
            for (int j = 0; j < numStr.length(); j++) {
                  if (numStr.charAt(j) != '0' && numStr.charAt(j) != '1') {
                        return false;
                  }
            }
            return true;
      }

      public static String solve(int n) {

            if (n == 1) {
                  return "YES";
            }
            int[] arr = { 10, 11, 101, 111, 110, 1101, 1100, 1001, 1010, 1011, 1111, 1110 };
            for (int i = 0; i < arr.length; i++) {
                  if (n % arr[i] == 0) {
                        return solve(n / arr[i]);
                  }
            }

            return "NO";
      }
}
