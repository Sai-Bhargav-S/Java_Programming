import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateArrays {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("The Non-duplicated Array is");
        Set<Integer> uniqArr=new LinkedHashSet<>();
        for(int x: arr){
            uniqArr.add(x);
        }

        //System.out.println(uniqArr);

        int[] resArr=new int[uniqArr.size()];
        int index=0;
        for(int x:uniqArr){
            resArr[index++]=x;
        }

        for(int x: resArr){
            System.out.println(x);
        }
    }
    
}
