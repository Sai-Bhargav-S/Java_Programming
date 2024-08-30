import java.util.Scanner;

public class ProgramPattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        
        char[] ch= str.toCharArray();
        int length=ch.length;

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(j==i || j==length-1-i){
                    System.out.print(ch[j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
