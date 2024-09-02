import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharString{

    public static void isChar(String str){
        char[] ch= str.toCharArray();
        int len = ch.length;
        String str2=new String();
        String str3=new String();
        
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if(count>1){
                str2+=ch[i];
            }
            if(count==1){
                str3+=ch[i];
            }
        }
        System.out.println(str2+str3);
    }
    public static void main(String[] args) {
        String str="zoho";
        isChar(str);  
            
        List<Character> list1=new ArrayList();
        for(int k=0;k<str2.length();k++){
            list1.add(str2.charAt(k));
        }
        Collections.sort(list1);

    }
}