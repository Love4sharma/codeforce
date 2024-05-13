import java.util.Scanner;

public class CanISquare {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    ;
                    int t = sc.nextInt();
                    while (t-- > 0) {
                              int n = sc.nextInt();
                              // int arr[]=new int[n];
                              long sum = 0;
                              for (int i = 0; i < n; i++) {
                                        // arr[i]=sc.nextInt();
                                        int s = sc.nextInt();
                                        sum += s;
                              }

                              if (isPerfectSquare(sum)) {
                                        System.out.println("YES");
                              } else {
                                        System.out.println("NO");
                              }

                    }
          }

          public static boolean isPerfectSquare(long number) {
                    if (number < 0) {
                              return false; // Negative numbers are not perfect squares
                    }

                    // Using the property that perfect squares have odd counts of divisors
                    int count = 0;
                    for (long i = 1; i * i <= number; i++) {
                              if (i * i == number) {
                                        count++;
                              }
                    }

                    return count == 1; // If count is 1, the number is a perfect square
          }
}
