import java.util.*;

public class MapInterface {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(1, "sai");map.put(8, "Java");
        map.put(3, "SpringBoot");map.put(4, null);
        map.put(5, "sai");map.put(6, "Programmer");
        map.put(3, "Helloo");map.put(null, "Hola");map.put(null, "Jai");
        map.put(9, "Hai");

        System.out.println(map);

        Map<Integer,String> map2=new LinkedHashMap<>();
        map2.put(1, "sai");map2.put(8, "Java");
        map2.put(3, "SpringBoot");map2.put(4, null);
        map2.put(5, "sai");map2.put(6, "Programmer");
        map2.put(3, "Helloo");map2.put(7, "Hola");
        map2.put(9, "Hai");map2.put(10, null);map2.put(null, null);

        System.out.println(map2);

        Map<Integer,String> map3=new TreeMap<>();
        map3.put(1, "sai");map3.put(8, "Java");
        map3.put(3, "SpringBoot");map3.put(4, null);
        map3.put(5, "sai");map3.put(6, "Programmer");
        map3.put(3, "Helloo");map3.put(7, "Hola");
        map3.put(9, "Hai");map3.put(10, null);map.put(null, null);

        System.out.println(map3);
        
    }
    
}
