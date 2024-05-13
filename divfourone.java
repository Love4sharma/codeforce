import java.util.*;

public class divfourone {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int x = sc.nextInt();
                  int y = sc.nextInt();
                  int arr[] = new int[2];
                  arr[0] = x;
                  arr[1] = y;
                  Arrays.sort(arr);
                  System.out.println(arr[0] + " " + arr[1]);
            }
      }
}
