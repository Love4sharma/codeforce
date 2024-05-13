import java.util.Scanner;

public class UnnaturalLanguageProcessing {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int t = sc.nextInt();
                    while (t-- > 0) {
                              int n = sc.nextInt();
                              String s = sc.next();
                              String ans = "";
                              boolean arr[] = new boolean[n];
                              for (int i = 0; i < n; i++) {
                                        arr[i] = false;
                              }
                              for (int i = 0; i < s.length() - 1; i++) {

                                        if (i >= 1 && (i + 2 < s.length())) {
                                                  if ((arr[i] != true && arr[i + 1] != true)
                                                                      && (arr[i + 2] != true && arr[i + 1] != true)
                                                                      && (checkConsonant(s.charAt(i))
                                                                                          && checkVowel(s.charAt(
                                                                                                              i + 1)))
                                                                      && (checkVowel(s.charAt(i + 1)) && checkConsonant(
                                                                                          s.charAt(i + 2)))) {
                                                            ans += s.charAt(i);
                                                            ans += s.charAt(i + 1);
                                                            ans += s.charAt(i + 2);
                                                            ans += ".";
                                                            arr[i] = true;
                                                            arr[i + 1] = true;
                                                            arr[i - 1] = true;
                                                  }
                                        }

                                        if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
                                                            && checkVowel(s.charAt(i + 1))) {
                                                  ans += s.charAt(i);
                                                  ans += s.charAt(i + 1);
                                                  ans += ".";
                                                  arr[i] = true;
                                                  arr[i + 1] = true;
                                        }

                              }
                              // System.out.println(ans);
                              if (ans.endsWith(".")) {
                                        ans = ans.substring(0, ans.length() - 1);
                              }
                              System.out.println(ans);
                    }
          }

          public static boolean checkVowel(char ch) {

                    char lowercaseCh = Character.toLowerCase(ch);

                    return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
                                        || lowercaseCh == 'u';
          }

          private static boolean checkConsonant(char ch) {

                    char lowercaseCh = Character.toLowerCase(ch);

                    return Character.isLetter(ch) && !isVowel(lowercaseCh);
          }

          private static boolean isVowel(char ch) {

                    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
          }

}






// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }
// import java.util.Scanner;

// public class UnnaturalLanguageProcessing {
//           public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                     int t = sc.nextInt();
//                     while (t-- > 0) {
//                               int n = sc.nextInt();
//                               String s = sc.next();
//                               String ans = "";
//                               boolean arr[] = new boolean[n];
//                               for (int i = 0; i < n; i++) {
//                                         arr[i] = false;
//                               }
//                               for (int i = 0; i < s.length() - 1; i++) {

//                                         if (i >= 1 && (i + 2 < s.length())) {
//                                                   if ((arr[i] != true && arr[i + 1] != true)
//                                                                       && (arr[i + 2] != true && arr[i + 1] != true)
//                                                                       && (checkConsonant(s.charAt(i))
//                                                                                           && checkVowel(s.charAt(
//                                                                                                               i + 1)))
//                                                                       && (checkVowel(s.charAt(i + 1)) && checkConsonant(
//                                                                                           s.charAt(i + 2)))) {
//                                                             ans += s.charAt(i);
//                                                             ans += s.charAt(i + 1);
//                                                             ans += s.charAt(i + 2);
//                                                             ans += ".";
//                                                             arr[i] = true;
//                                                             arr[i + 1] = true;
//                                                             arr[i - 1] = true;
//                                                   }
//                                         }

//                                         if ((arr[i] != true && arr[i + 1] != true) && checkConsonant(s.charAt(i))
//                                                             && checkVowel(s.charAt(i + 1))) {
//                                                   ans += s.charAt(i);
//                                                   ans += s.charAt(i + 1);
//                                                   ans += ".";
//                                                   arr[i] = true;
//                                                   arr[i + 1] = true;
//                                         }

//                               }
//                               // System.out.println(ans);
//                               if (ans.endsWith(".")) {
//                                         ans = ans.substring(0, ans.length() - 1);
//                               }
//                               System.out.println(ans);
//                     }
//           }

//           public static boolean checkVowel(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o'
//                                         || lowercaseCh == 'u';
//           }

//           private static boolean checkConsonant(char ch) {

//                     char lowercaseCh = Character.toLowerCase(ch);

//                     return Character.isLetter(ch) && !isVowel(lowercaseCh);
//           }

//           private static boolean isVowel(char ch) {

//                     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//           }

// }

