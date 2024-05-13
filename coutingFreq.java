import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class coutingFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];

        System.err.println("Enter the array elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" has frequency ->"+entry.getValue());
        }
    }
    
}
