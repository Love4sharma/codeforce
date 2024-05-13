import java.util.Scanner;

public class bubbleSort {
    private static void swap(int []arr , int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        boolean isSwapped=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    isSwapped=true;
                    System.out.println(j);
                    swap(arr,j,j+1);
                }
            }
            if(isSwapped)
                break;
        }

        System.out.println("sorted array -->");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
// Time complexity 
// best case-> O(n)
// average case -> O(n^2)
// worst case -> O(n^2)

// Space complexity -> O(1)
