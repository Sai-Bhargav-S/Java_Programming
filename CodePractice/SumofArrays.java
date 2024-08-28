import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumofArrays{

    public static void main(String[] args) {
        
        //List<Integer> arr = Arrays.asList(12,45,6,34,21,67,78);
        // int s2= arr.stream().reduce(0,(c,e)->c+e);       
        // System.out.println(s2);

        Scanner sc=  new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
           
        int res=0;
        for(int x: arr){
            res=res+x;
        }
        System.out.println(res);
    }
    
}