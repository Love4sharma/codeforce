import java.util.Scanner;

public class divisiblebyn {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  int low = 1;
                  int high = n * k;
                  while(low<high){
                        int mid=low+(high-low)/2;
                        int r=mid/n;
                        if(r*n==mid){
                              
                        }
                  }

            }
      }
}
