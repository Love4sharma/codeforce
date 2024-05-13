import java.util.*;

public class doublestrings {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  String arr[] = new String[n];
                  for (int i = 0; i < n; i++) {
                        arr[i] = sc.next();
                  }

                  int nums[] = new int[n];
                  Arrays.fill(nums, 0);
                  for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                              for (int k = 0; k < n; k++) {
                                    if (arr[i].equals(arr[j] + arr[k])) {
                                          nums[i] = 1;
                                    }
                                    break;
                              }
                              if (nums[i] == 1) {
                                    break;
                              }
                        }
                  }
                  String s = "";
                  for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == 0) {
                              s += "0";
                        } else {
                              s += "1";
                        }
                  }

                  System.out.println(s);

            }
      }
}
