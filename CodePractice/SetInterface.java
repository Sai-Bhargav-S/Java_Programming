import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(2);set.add(4);set.add(null);set.add(79);set.add(6);set.add(34);set.add(79);set.add(null);set.add(90);

        System.out.println(set);

        Set<Integer> set2=new TreeSet<>();
        set2.add(2);set2.add(4);set2.add(79);set2.add(4);set2.add(34);set2.add(79);set2.add(90);set2.add(1);
        System.out.println(set2);

        Set<String> set3=new LinkedHashSet<>();
        set3.add("sai");set3.add("Java");set3.add("sai");set3.add(null);set3.add("Program");set3.add(null);
        System.out.println(set3);

    }
    
}
