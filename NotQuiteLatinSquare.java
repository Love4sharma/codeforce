import java.util.Scanner;

public class NotQuiteLatinSquare {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int t = sc.nextInt();
                    while (t-- > 0) {
                              char[][] square = new char[3][3];
                              for (int i = 0; i < 3; i++) {
                                        String row = sc.nextLine();
                                        square[i] = row.toCharArray();
                              }

                    }
          }
}
