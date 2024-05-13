import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeGotEverythingCovered {

      static List<String> list = new ArrayList<>();

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  String alphabet = "abcdefghijklmnopqrstuvwxyz";
                  String s = alphabet.substring(0, k);
                  StringBuilder s1 = new StringBuilder();
                  for (int i = 1; i <= n; i++) {
                        s1.append((s));
                  }

                  String ans = s1.toString();
                  System.out.println(ans);
            }
      }
}