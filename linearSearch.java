import java.util.Scanner;

/**
 * linearSearch
 */
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];

        System.err.println("Enter the array elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target=sc.nextInt();
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                found=true;
                System.err.println("found at "+  i);
                break;
            }
        }

        if(!found){
            System.out.println("not found");
        }
    }
    
}
// Time complexity -->
// Best case -> O(1)
// Average case -> O(n)
// Worst case -> O(n)

// Space Complexity -> O(n)
