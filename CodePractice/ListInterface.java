import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        List<String> arr= new ArrayList<String>();

        arr.add("Sai");
        arr.add("Bhargav");

        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.contains("hai"));
        arr.add("Hello");
        arr.remove(0);
        System.out.println(arr);


        
        List<String> arr2=Arrays.asList("Java","SpringBoot");
        arr2.set(0, "Hai");
        System.out.println(arr2);

        List<Integer> list=new LinkedList<>();
        list.add(8);
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(14);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
