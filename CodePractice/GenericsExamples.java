class Square<U>{
    Square(U u,Class<U> type){
        this.side = u;
        this.type =type;
    }
    U side;
    Class<U> type;
    public void area(){
        if(type== String.class){
            System.out.println((String)side+(String)side);
        }
        else if(type==Integer.class){
            System.out.println((int)side*(int)side);
        }
    }
}

class Circle<T>{
    T radius;
    Class<T> type;

    Circle(T t,Class<T> type){
        this.radius=t;
        this.type=type;
    }

    public void area(){
        if(type== String.class){
            System.out.println((String)radius+(String)radius);
        }else if(type==Integer.class){
            System.out.println(3.14*(int)radius*(int)radius);
        }
    }

}
// class A<T extends Number>{
//     A(T t){
//         this.t = t;
//     }
//     T t;
//     void print(){
//         System.out.println(t);
//     }
// }


public class GenericsExamples {

    public static void main(String[] args) {
        // Square<String> sq = new Square<String>("abc",String.class);
        // sq.area();
        // Square<Integer> sq1 = new Square<Integer>(10,Integer.class);
        // sq1.area();

        // A<Double> a = new A(20);
        // a.print();

        Circle<Integer> d=new Circle<Integer>(3, Integer.class);
        d.area();
        Circle<String> d1=new Circle<String>("sai", String.class);
        d1.area();


    }    
}
