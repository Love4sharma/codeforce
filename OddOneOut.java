import java.util.Scanner;

public class OddOneOut {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int t = sc.nextInt();
                    while (t-- > 0) {
                              int a = sc.nextInt();
                              int b = sc.nextInt();
                              int c = sc.nextInt();
                              int e = 0;
                              System.out.println(e ^ a ^ b ^ c);
                    }
          }
}