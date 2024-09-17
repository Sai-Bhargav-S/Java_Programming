
import java.util.Scanner;
public class ReverseInt {

    public static int reverseInt(int x){
        String str=Integer.toString(x);
        char[] ch=new char[str.length()];

        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(str.length()-i-1);
        }

        String str2=new String(ch);

        return Integer.parseInt(str2);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ur integer: ");
        int n=sc.nextInt();
        System.out.println(reverseInt(n));
    }
    
}
