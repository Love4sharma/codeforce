import java.util.*;

public class Upscaling {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  char ans[][] = new char[2 * n][2 * n];
                  int c = 0;
                  for (int i = 0; i < 2 * n; i += 2) {
                        if (c == 0) {
                              boolean f = true;
                              for (int j = 0; j < 2 * n; j += 2) {
                                    if (f == true) {
                                          ans[i][j] = '#';
                                          ans[i][j + 1] = '#';
                                          ans[i + 1][j] = '#';
                                          ans[i + 1][j + 1] = '#';
                                          f = false;
                                    } else {
                                          ans[i][j] = '.';
                                          ans[i][j + 1] = '.';
                                          ans[i + 1][j] = '.';
                                          ans[i + 1][j + 1] = '.';
                                          f = true;
                                    }

                              }
                              c = 1;
                        } else {
                              boolean f1 = true;
                              for (int j = 0; j < 2 * n; j += 2) {
                                    if (f1 == true) {
                                          ans[i][j] = '.';
                                          ans[i][j + 1] = '.';
                                          ans[i + 1][j] = '.';
                                          ans[i + 1][j + 1] = '.';
                                          f1 = false;
                                    } else {
                                          ans[i][j] = '#';
                                          ans[i][j + 1] = '#';
                                          ans[i + 1][j] = '#';
                                          ans[i + 1][j + 1] = '#';
                                          f1 = true;
                                    }

                              }
                              c = 0;
                        }
                  }

                  for (int i = 0; i < ans.length; i++) {
                        for (int j = 0; j < ans[i].length; j++) {
                              System.out.print(ans[i][j]);
                        }
                        System.out.println();
                  }
            }

      }
}
