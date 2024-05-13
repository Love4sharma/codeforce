import java.util.Scanner;

public class dubstep {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String ans[] = s.split("WUB");

            for (int i = 0; i < ans.length; i++) {
                  if (ans[i].length() >= 1) {
                        System.out.print(ans[i] + " ");
                  }

            }
      }
}
