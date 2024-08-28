package CodePractice;

public class SumofDigits {

    public static String isSum(int x){
        int sum=0;
        int num=Math.abs(x);
        System.out.println("The given Number is: "+x);
        for(int i=num;i>0;i=i/10){
            sum=sum+i%10;
        }
        return ("The total sum is "+sum);
    }


    public static void main(String[] args) { 
        int n=-1991;
        System.out.println(isSum(n));
    }
    
}
