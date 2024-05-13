import java.util.*;

public class RudolfandtheUglyString {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  String s = sc.next();
                  int c = 0;
                  while (s.contains("map")) {
                        c++;
                        int i = s.indexOf("map");
                        if (i + 3 < s.length()) {
                              s = s.substring(0, i + 1) + s.substring(i + 3);
                        } else {
                              s = s.substring(0, i + 1);
                        }

                  }

                  while (s.contains("pie")) {
                        c++;
                        int i = s.indexOf("pie");
                        if (i + 3 < s.length()) {
                              s = s.substring(0, i + 1) + s.substring(i + 3);
                        } else {
                              s = s.substring(0, i + 1);
                        }

                  }
                  System.out.println(c);

            }
      }
}



import java.util.Scanner;

public class RudolfandtheUglyString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();

            int c=0;
            for(int j=0;j<n-2;j++){
                String s1=s.substring(j,j+3);
                // System.out.println(s1);
                if(s1.equals("map") ||  s1.equals("pie")){
                    c++;
                    j+=2;
                }
                
            }

            System.out.println(c);
        }
    }
}