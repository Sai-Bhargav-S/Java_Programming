public class CustomException extends Exception {

    public CustomException(String message){
        super(message);
    }

    public CustomException(String message,Throwable cause){
        super(message, cause);
    }

    public static void main(String[] args) throws CustomException {
        try{
            int x=1/0;
        }catch(Exception e){
            throw new CustomException("Cannot divide by Zero"+e.getMessage() );
        }
    }
    
}
