
class Addition{

    Addition(){
        System.out.println("In Engine Constructor");
    }
    public int add(int a,int b){
        return a+b;
    }
}

class Multiple extends Addition{

    Multiple(){
        System.out.println("Car's Constructor");
    }
    
    public int add(int a, int b){
        return a*b;
    }

}

//Method Overloading
class Summation{

    public int sum(int a, int b){
        return a+b;
    }

    public Long sum(int a, Long b, int c){
        return a+b+c;
    }
}

class Divide extends Summation{
    public Long sum(int a, Long b, int c){
        return a+b+c+2;
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
        Addition a= new Addition();

        //dynamic method dispacth
        Addition b=new Multiple();
        Multiple c=new Multiple();
        
        System.out.println(c.add(4, 5));
        System.out.println(b.add(4, 6));
        System.out.println(a.add(2, 8));

        Summation s=new Summation();

        System.out.println(s.sum(4, 5L, 6));

        Divide div=new Divide();
        System.out.println(div.sum(3, 4L, 3));

        //dynamic method dispacth
        Summation sa=new Divide();
        System.out.println(sa.sum(3, 4L, 3));

    }
}
