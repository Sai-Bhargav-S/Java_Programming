public class VowelsCountString {

    public static void isVol(String str){
        char[] ch=str.trim().replaceAll("\\s","").toLowerCase().toCharArray();
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                count++;
            }
        }
        System.out.println(count);
        
    }

    public static void main(String[] args) {
        String str="AEIOUsai";
        isVol(str);
        
    }
    
}
