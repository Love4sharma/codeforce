import java.util.*;

public class divfourthree {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int c = sc.nextInt();
                  int d = sc.nextInt();
                  long count = 0;
                  if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                  }
                  for (int i = a; i <= b; i++) {
                        if (i == c || i == d) {
                              count++;
                        }
                  }
                  if (count == 2 || count == 0) {
                        System.out.println("NO");
                  } else {
                        System.out.println("YES");
                  }
            }
      }
}
