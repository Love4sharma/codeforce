import java.util.*;

public class PlayingWithGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = new int[n+1];
            ans[0] = arr[0];
            ans[n] = arr[n-1];
            for (int i = 0; i < n-1; i++) {
                ans[i+1]= lcm(arr[i],arr[i+1]);
            }
            Boolean flag = true;
            for (int i = 0; i < n; i++) {
                if(gcd(ans[i],ans[i+1])!=arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    static int lcm(int a , int b){
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return Math.abs(a * b) / gcd(a, b);
        }
    }
    static int gcd(int a , int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static class pair{
        int x;
        int y;
        public pair(int x, int y){
            this.x =x;
            this.y=y;
        }
    }
}
