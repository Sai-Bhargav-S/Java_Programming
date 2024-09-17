import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesTypes {

    public static void main(String[] args) {

        //Function FI
        Function<String, Integer> fun=new Function<String,Integer>() {
            public Integer apply(String t) {
                return t.length();
            }  
        };

        String t="Sai Bhargav";
        int len=fun.apply(t);
        System.out.println(len);

        BiFunction<String,Integer,Integer> biFun=(a,b)->Integer.parseInt(a)+b;
        System.out.println(biFun.apply("73", 7));

        //Predicate FI
        Predicate<Integer> pred= x -> (x%2==0)?true:false;
        System.out.println(pred.test(45));

        BiPredicate<Integer,Integer> BiPred=(y,z)-> (y>z)?true:false;
        System.out.println(BiPred.test(56, 89));

        //Consumer FI
        Consumer<Integer> con=i->System.out.println(i+4);
        con.accept(5);

        BiConsumer<String,Integer> biCon=(p,q)->System.out.println(Integer.parseInt(p)+q);
        biCon.accept("78", 3);

        //Supplier FI
        Supplier<String> sup=()->"hello";
        System.out.println(sup.get());

        //Unary and Binary FI
        UnaryOperator<Integer> u1=(a)->{
            return a+4;
        };
        System.out.println(u1.apply(34));

        BinaryOperator<Integer> bu=(a,b)->{
            return a+b;

        };
        System.out.println(bu.apply(23, 8));


    }
    
}
