package CodePractice;

public class Maxnum {
    public static void main(String[] args) {
        int[] arr={1,2,3,12,34,7,89,68};
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=res){
                res=arr[i];
            }
        }
        System.out.println(res);
    }
    
}
