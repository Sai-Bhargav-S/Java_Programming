package CodePractice;

import java.util.Scanner;

public class ReverseString {

    public static void reverseString(String s){
    
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(s.length()-i-1);
        }   
        System.out.println(new String(ch));    

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ur string: ");
        String str=sc.nextLine();
        reverseString(str);
    }
    
}
