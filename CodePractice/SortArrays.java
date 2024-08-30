import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortArrays {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the Values of array: ");
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("The given array is: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    System.out.println(arr.length-i-1);
                }
            }
        }
       // Arrays.sort(arr);

        System.out.println("The Sorted array is: ");
        for(int i: arr){
            System.out.print(i+" ");
        }


    }
    
}
