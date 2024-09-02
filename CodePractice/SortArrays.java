import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortArrays {

    public static boolean isPal(String str) {

        int len =str.length();
        String str2=str.trim().replaceAll("\\s", "").toLowerCase();
        String str3=new String();
        for(int i=0;i<len;i++){
            if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u'){
                str3+=str2.charAt(i);
            }
        }

        int len2=str3.length();
        for(int i=0;i<len2/2;i++){
           if(str3.charAt(i)!=str3.charAt(len2-i-1)){
               return false;
           }
         }
        return true;

    }

    public static void main(String[] args) {
        String str="a";
        if(isPal(str)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
}
