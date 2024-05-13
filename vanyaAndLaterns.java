import java.util.*;

public class vanyaAndLaterns {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int l = sc.nextInt();
            int[] len = new int[n];

            for (int i = 0; i < n; i++) {
                  len[i] = sc.nextInt();
            }

            Arrays.sort(len);
            double max = Math.max(len[0], l - len[n - 1]);
            for (int i = 1; i < n; i++) {
                  max = Math.max(max, (len[i] - len[i - 1]) / 2.0);

            }
            System.out.printf("%.9f\n", max);
      }
}
