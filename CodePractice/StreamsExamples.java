import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamples {

    public static void main(String[] args) {
        List<Integer> arr = List.of(61,61,12,35,42,56,6,6,7,78,35);

        //forEach
        Stream<Integer> s1=arr.stream();
        s1.forEach(n->System.out.println(n));


        //How to find duplicate elements in a Stream in Java?
        Set<Integer> sortStream=new HashSet<>();
        List<Integer> s2=s1.filter(n-> !sortStream.add(n)).collect(Collectors.toList());
        System.out.println(s2);

        //odd numbers
        Stream<Integer> s4=s1.filter(n->n%2!=0);
        s4.forEach(n->System.out.println(n));   

        //sum of numbers less than 10
        int result=s1.filter(n->n<10).map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(result);    
        

    }
    
}
