import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<arr.length;i++) {
            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
           
            arr[j+1]=key;
            // System.out.println("i-->"+1+" j-->"+(j+1));
        }

        System.out.println("sorted array -> ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
    
}
// Time Complexity
// Best case -> O(n)
// Average case -> O(n^2)\
// Worst case -> O(n^2)

// Space complexity -> O(1);