import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        List<Integer> arr=List.of(1,2,34,54,7,65,9,9,34,2,89,99,89,99,67,65,3,2);
        
        Set<Integer> arrSet=new HashSet<>();
        arrSet.addAll(arr);
        arrSet.add(119);
        arrSet.removeIf(n->n>90);
        System.out.println(arrSet);

        Set<Integer> arrList=new LinkedHashSet<>();
        arrList.addAll(arr);
        arrList.add(119);
        arrList.removeIf(n->n>90);
        System.out.println(arrList);

    }
    
}
