package CodePractice;

import java.util.Scanner;

public class IntPalindrome {

    public static boolean isIntPalindrome(int x){

        String str=Integer.toString(x);
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int n=sc.nextInt();

        if(isIntPalindrome(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
    
}