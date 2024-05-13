import java.util.Scanner;

public class latinsquare {

          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

                    // Read the number of test cases
                    int t = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    for (int testCase = 0; testCase < t; testCase++) {
                              // Read the Latin square for each test case
                              char[][] square = new char[3][3];
                              for (int i = 0; i < 3; i++) {
                                        String row = scanner.nextLine();
                                        square[i] = row.toCharArray();
                              }

                              // Find and print the missing letter for each test case
                              char missingLetter = findMissingLetter(square);
                              System.out.println(missingLetter);
                    }

                    scanner.close();
          }

          private static char findMissingLetter(char[][] square) {
                    for (char[] row : square) {
                              if (countOccurrences(row, '?') == 1) {
                                        for (char c : "ABC".toCharArray()) {
                                                  if (!contains(row, c)) {
                                                            return c;
                                                  }
                                        }
                              }
                    }

                    for (int col = 0; col < 3; col++) {
                              char[] column = new char[3];
                              for (int row = 0; row < 3; row++) {
                                        column[row] = square[row][col];
                              }

                              if (countOccurrences(column, '?') == 1) {
                                        for (char c : "ABC".toCharArray()) {
                                                  if (!contains(column, c)) {
                                                            return c;
                                                  }
                                        }
                              }
                    }

                    // This line should not be reached if the input is valid
                    return ' ';
          }

          private static int countOccurrences(char[] array, char target) {
                    int count = 0;
                    for (char c : array) {
                              if (c == target) {
                                        count++;
                              }
                    }
                    return count;
          }

          private static boolean contains(char[] array, char target) {
                    for (char c : array) {
                              if (c == target) {
                                        return true;
                              }
                    }
                    return false;
          }
}
