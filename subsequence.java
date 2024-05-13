import java.util.ArrayList;

public class subsequence {

          public static void printSubsequences(int[] arr, int index,
                              ArrayList<Integer> path) {

                    // Print the subsequence when reach
                    // the leaf of recursion tree
                    if (index == arr.length) {

                              // Condition to avoid printing
                              // empty subsequence
                              if (path.size() > 0)
                                        System.out.println(path);
                    }

                    else {

                              // Subsequence without including
                              // the element at current index
                              printSubsequences(arr, index + 1, path);

                              path.add(arr[index]);

                              // Subsequence including the element
                              // at current index
                              printSubsequences(arr, index + 1, path);

                              // Backtrack to remove the recently
                              // inserted element
                              path.remove(path.size() - 1);
                    }
                    return;
          }

          public static void main(String[] args) {
                    int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
                    ArrayList<Integer> path = new ArrayList<>();
                    printSubsequences(arr, 0, path);
          }
}
