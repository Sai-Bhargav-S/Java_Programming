package CodePractice;

public class Fibonacci {
    public static void isFibo(int x){
        int n=Math.abs(x);
        int a=0,b=1,res=0;
        if(n==0){
            System.out.println(a);
        }
        if(n==1){
            System.out.println(b);
        }
        System.out.print(a+" "+b+" ");
        if(n>=2){
            for(int i=2;i<n;i++){
                res=a+b;
                System.out.print(res+" ");
                a=b;
                b=res;
            }
        }
    }   

    public static void main(String[] args) {
        int n=9;
        isFibo(n);
    }
}
