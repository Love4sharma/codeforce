public class bitwisexor {
          public static void main(String[] args) {
                    int arr[] = { 2, 1, 3, 4 };
                    int m = 0;
                    for (int ele : arr) {
                              m = m ^ ele;
                    }
                    int k = 1;
                    System.out.println(Integer.toBinaryString(m ^ k));
          }
}
