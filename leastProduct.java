import java.util.Scanner;

public class leastProduct {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int t = sc.nextInt();
                    while (t-- > 0) {
                              int n = sc.nextInt();
                              int arr[] = new int[n];
                              int count_neg = 0;
                              int zeros = 0;
                              long r = 1;
                              for (int i = 0; i < n; i++) {
                                        arr[i] = sc.nextInt();
                                        if (arr[i] == 0)
                                                  zeros++;
                                        if (arr[i] < 0)
                                                  count_neg++;
                                        r *= arr[i];
                              }
                              if (zeros != 0) {
                                        System.out.println(0);
                              } else if (count_neg % 2 == 0) {
                                        System.out.println(1);
                                        System.out.println(0);
                              } else {
                                        System.out.println(0);
                                        System.out.println(r);
                              }
                    }
          }
}
