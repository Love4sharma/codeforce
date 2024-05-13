import java.util.*;

public class shape {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  char[][] arr = new char[n][n];
                  for (int i = 0; i < n; i++) {
                        String s = sc.next();
                        for (int j = 0; j < n; j++) {
                              arr[i][j] = s.charAt(j);
                        }
                  }

                  int top = -1;
                  int last = -1;
                  int left = -1;
                  int right = -1;
                  for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                              if (arr[i][j] == '1') {
                                    if (top == -1)
                                          top = i;
                                    last = i;
                                    if (left == -1 || j < left)
                                          left = j;
                                    if (right == -1 || j > right)
                                          right = j;
                              }
                        }
                  }
                  int l = right - left + 1;
                  if ((last - top + 1) == l && l == (right - left + 1)) {
                        System.out.println("SQUARE");
                  } else {
                        System.out.println("TRIANGLE");
                  }
            }
      }

}
