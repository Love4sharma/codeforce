import java.util.Scanner;

public class TeamCompositionProgrammersandMathematicians {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int t = sc.nextInt();
                    while (t-- > 0) {
                              long a = sc.nextInt();
                              long b = sc.nextInt();
                              long c = a + b;
                              System.out.println(Math.min(Math.min(a, b), c / 4));

                    }
          }
}
