package CodePractice;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int x){
        if(x<=1){
            return false;
        }

        if(x>2){
            for(int i=2;i<=x/2;i++){
                if(x%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        if(isPrime(n)){
            System.out.println(n+" is Prime number");
        }else{
            System.err.println(n+" is not Prime number");
        }

    }
    
}
