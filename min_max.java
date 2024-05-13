import java.util.Scanner;

/**
 * min_max
 */
public class min_max {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];

        System.out.println("Enter the array elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("maximum element is "+max);
        System.out.println("minimum element is "+min);
    }
}