import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class contestdiv {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int m = sc.nextInt();
                  int k = sc.nextInt();
                  List<Integer> list = new ArrayList<>();
                  List<Integer> list2 = new ArrayList<>();
                  Set<Integer> set = new HashSet<>();
                  Set<Integer> set2 = new HashSet<>();
                  for (int i = 0; i < n; i++) {
                        int ele = sc.nextInt();
                        list.add(ele);

                  }

                  for (int i = 0; i < m; i++) {
                        int ele1 = sc.nextInt();
                        list2.add(ele1);

                  }
                  Collections.sort(list);
                  Collections.sort(list2);

                  for (int i = 0; i < n; i++) {
                        if (list.get(i) <= k) {
                              set.add(list.get(i));
                        }
                  }

                  for (int i = 0; i < m; i++) {
                        if (list2.get(i) <= k) {
                              set2.add(list2.get(i));
                        }
                  }

                  if (set.size() < k / 2 || set2.size() < k / 2) {
                        System.out.println("NO");
                  } else {

                        boolean found = true;
                        List<Integer> ans = new ArrayList<>();
                        for (Integer m1 : set) {
                              ans.add(m1);
                        }
                        for (Integer m2 : set2) {
                              if (!ans.contains(m2)) {
                                    ans.add(m2);
                              }

                        }
                        Collections.sort(ans);
                        for (int i = 0; i < k; i++) {
                              if (ans.get(i) != i + 1) {
                                    found = false;
                                    break;
                              }
                        }
                        if (found) {
                              System.out.println("YES");
                        } else {
                              System.out.println("NO");
                        }
                  }
                  // Collections.sort(list);
                  // Collections.sort(list2);

            }

      }
}

// import java.util.*;
// import java.util.Scanner;

// public class contestdiv {
// public static String solve(int n, int m, int k, int arr[], int brr[]) {

// Arrays.sort(arr);
// Arrays.sort(brr);

// Set<Integer> st = new HashSet<>();
// Set<Integer> st2 = new HashSet<>();

// for (int i = 0; i < n; i++) {
// if (arr[i] <= k) {
// st.add(arr[i]);
// }
// }
// for (int j = 0; j < m; j++) {
// if (brr[j] <= k) {
// st2.add(brr[j]);
// }
// }

// boolean nums[] = new boolean[k + 1];
// int c1 = 0;
// int c2 = 0;
// for (Integer ele : st) {
// if (ele >= 1 && ele <= k) {
// nums[ele] = true;
// c1++;
// }
// }

// for (Integer ele : st2) {
// if (ele >= 1 && ele <= k) {
// nums[ele] = true;
// c2++;
// }
// }

// if (c1 >= k / 2 && c2 >= k / 2) {
// for (int i = 1; i < nums.length; i++) {
// if (nums[i] == false) {
// return "NO";
// }
// }
// return "YES";
// }
// return "NO";
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int tc = sc.nextInt();
// while (tc > 0) {

// int n = sc.nextInt();
// int m = sc.nextInt();
// int k = sc.nextInt();
// int[] arr = new int[n];
// int[] brr = new int[m];

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// for (int j = 0; j < m; j++) {
// brr[j] = sc.nextInt();
// }
// System.out.println(solve(n, m, k, arr, brr));

// tc--;
// }
// }
// }