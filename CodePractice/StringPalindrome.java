package CodePractice;

import java.util.Scanner;

public class StringPalindrome {

    public static boolean isPalindrome(String s){
        String str2=s.replaceAll("\\s","").toLowerCase();
        int length=str2.length();
        for(int i=0;i<=length/2;i++){
            if(str2.charAt(i)!=str2.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
    
}
