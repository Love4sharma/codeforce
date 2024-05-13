import java.util.*;

public class number {
      static int digit[] = new int[200010];
      static int m = 200010;

      public static void sumDigits() {
            for (int i = 1; i < m; i++) {
                  int s = 0;
                  int n = i;
                  while (n > 0) {
                        s += n % 10;
                        n /= 10;
                  }
                  digit[i] = digit[i - 1] + s;
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sumDigits();
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  System.out.println(digit[n]);
            }

      }
}

// #include <iostream>
// #include <vector>

// using namespace std;

// const int mxn = 200010;
// int digitSum[mxn];

// void precalculate() {
// for (int i = 1; i < mxn; ++i) {
// int sum = 0;
// int num = i;
// while (num > 0) {
// sum += num % 10;
// num /= 10;
// }
// digitSum[i] =digitSum[i-1]+sum;
// }
// }

// int main() {
// ios_base::sync_with_stdio(false);
// cin.tie(NULL);

// precalculate();

// int t;
// cin >> t;
// while (t--) {
// int n;
// cin >> n;
// cout << digitSum[n] << endl;
// }

//     return 0;
// }
