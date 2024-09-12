abstract class Mobile{
    public abstract void processor();

    public void color(){
        System.out.println("Black as default color");
    }

    public static void brand(){
        System.err.println("Any Mobile Brand");
    }

    Mobile(){
        System.out.println("Mobile's Constructor..");
    }
}

class Oneplus extends Mobile{

    public void processor() {
        System.out.println("Qualcom processor..");
    }

    public void color(){
        System.out.println("changed to Blue color");
    }

    Oneplus(){
        System.out.println("Oneplus Constructor");
    }
    
}

public class AbstractExample {
    public static void main(String[] args) {
        Oneplus oneplus=new Oneplus();
        oneplus.processor();
        oneplus.color();
        //oneplus.brand();

        Mobile.brand();
        
    }
}
