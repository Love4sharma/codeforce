import java.util.Scanner;

/**
 * binarySearch
 */
public class binarySearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];

        System.err.println("Enter the array elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        boolean found=false;
        while(low<=high){
            int mid=low+ (high-low)/2;

            if(arr[mid]==target){
                System.err.println("found at "+mid );
                found=true;
                break;
                // return "found at "+mid ;
            }
            else if(arr[mid] > target)
                high=mid-1;
            else
                low=mid+1;

        }

        if(!found)
            System.err.println("Not found");

        sc.close();
    }
}
// Time Complexity
// Best Case -> O(1)
// Average Case -> O(log(n))
// Worst Case -> O(log(n))

// Space Complexity -> O(1)