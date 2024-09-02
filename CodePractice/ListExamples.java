import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(45);
        list.add(56);
        list.add(59);
        list.add(8);
        list.add(6);
        list.add(91);

        list.remove(3);
        list.add(87);
        list.add(3, 99);
        list.removeIf(n->n>=90);

        System.out.println(list);


        LinkedList<String> listArr=new LinkedList<>(List.of("sai","Bhargav","TCS","CTS","CP","Dell"));
        listArr.add("HP");
        listArr.add("Deloitte");
        listArr.removeLast();
        listArr.remove(0);
        listArr.removeIf(n->n=="CP");
        System.out.println(listArr);

    }
    
}
