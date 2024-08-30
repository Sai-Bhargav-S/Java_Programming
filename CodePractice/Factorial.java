public class Factorial {
    public static int isFact(int x){
        int res=1;
        if(x>=1){
            for(int i=1;i<=x;i++){
                res=res*i;
            }
        }   
        return res; 
    }

    public static void main(String[] args) {
        int x=5;
        System.out.println(isFact(x));
    }
    
}
