import java.util.*;

public class f4 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  int pb = sc.nextInt();
                  int ps = sc.nextInt();
                  int p[] = new int[n];
                  int arr[] = new int[n];
                  for (int i = 0; i < n; i++) {
                        p[i] = sc.nextInt();
                  }
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                  }
                  int mp = 0;
                  int sp = 0;
                  while (k > 0) {
                        mp += arr[pb - 1];
                        sp += arr[ps - 1];
                        if (arr[p[pb - 1] - 1] > arr[pb - 1]) {
                              pb = p[pb - 1];
                        }
                        if (arr[p[ps - 1] - 1] > arr[ps - 1]) {
                              ps = p[ps - 1];
                        }
                        k--;
                  }
                  if (mp > sp) {
                        System.out.println("Bodya");
                  } else if (sp > mp) {
                        System.out.println("Sasha");
                  } else {
                        System.out.println("Draw");
                  }
            }
      }
}
