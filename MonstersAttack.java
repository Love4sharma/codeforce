import java.util.*;

public class MonstersAttack {
      public static void lets_solve() {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] v1 = new int[n];
            int[] v2 = new int[n];
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                  v1[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                  v2[i] = scanner.nextInt();
                  mp.put(Math.abs(v2[i]), mp.getOrDefault(Math.abs(v2[i]), 0) + v1[i]);
            }
            int pts = k;
            for (int i = 0; i < n; i++) {
                  if (pts < mp.getOrDefault(i + 1, 0)) {
                        System.out.println("NO");
                        return;
                  }
                  pts -= mp.getOrDefault(i + 1, 0);
                  pts += k - 1;
            }
            System.out.println("YES");
      }

      public static void main(String[] args) {
            lets_solve();
      }
}