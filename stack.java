import java.util.Arrays;
import java.util.Stack;

public class stack {
          public static void main(String[] args) {

                    Stack<Integer> st = new Stack<>();
                    Stack<Integer> st2 = new Stack<>();
                    int nums1[] = { 4, 1, 2 };
                    int nums2[] = { 1, 2, 3, 4 };

                    int arr[] = new int[nums1.length];
                    Arrays.fill(arr, -1);
                    for (int i = 0; i < nums2.length; i++) {
                              st.push(nums2[i]);
                              // st2.push(nums2[i]);
                    }
                    for (int i = 0; i < nums2.length; i++) {
                              st2.push(nums2[i]);
                              // st2.push(nums2[i]);
                    }
                    for (int i = 0; i < nums1.length; i++) {
                              while (!st.isEmpty()) {
                                        int m = st.pop();
                                        if (m > nums1[i]) {
                                                  arr[i] = m;
                                        }
                              }
                              st = st2;
                    }
                    System.out.println(Arrays.toString(arr));
                    // System.out.println(st);
                    // System.out.println(st2);
          }
}
