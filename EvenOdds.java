import java.util.*;

public class EvenOdds {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long number = sc.nextLong();
            if (number <= (n + 1) / 2) {
                  System.out.println((2 * number) - 1);
            } else {
                  number = number - ((n + 1) / 2);
                  System.out.println(2 * number);
            }

      }
}
