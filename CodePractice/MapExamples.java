import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        List<Integer> id=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        List<String> name=new ArrayList<>(Arrays.asList("Sai","Bhargav","TCS","CTS","Hello","Dell","Zoho","Lenovo","Lenovo"));

        Map<Integer,String> data=new HashMap<>();
        for(int i=0;i<id.size();i++){
            data.put(id.get(i), name.get(i));
        }

        data.put(150, "Cater pillar");
        System.out.println(data);


        Map<Integer,String> dataList=new LinkedHashMap<>();
        for(int i=0;i<id.size();i++){
            dataList.put(id.get(i), name.get(i));
        }
        dataList.put(150, "Cater Pillar");
        System.out.println(dataList);





    }
}
