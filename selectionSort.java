import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min])
                    min=j;

            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        System.out.println("sorted array -> ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
    
}
// Time complexity 
// best case -> O(n^2)
// average case-> O(n^2)
// worst case -> O(n^2)

// space complexity -> O(1)
