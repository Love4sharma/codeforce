import java.util.Stack;

public class previous {
      public static void main(String[] args) {

            int heights[] = { 2, 1, 5, 6, 2, 3 };
            int arr[] = new int[heights.length];
            int n = heights.length;
            Stack<Integer> st = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                  if (st.isEmpty()) {
                        st.push(i);
                  } else if (heights[i] >= heights[st.peek()]) {
                        st.push(i);

                  } else {
                        while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                              arr[st.pop()] = i;
                        }
                        st.push(i);
                  }
                  while (!st.isEmpty()) {
                        arr[st.pop()] = -1;
                  }
            }
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
      }

}
