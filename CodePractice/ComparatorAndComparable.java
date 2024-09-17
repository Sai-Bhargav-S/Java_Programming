import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

class Student implements Comparable<Student>{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Student s) {
        if(this.age>s.age){
            return 1;
        }else{
            return -1;
        }
    }
    
}

public class ComparatorAndComparable {

    public static void main(String[] args) {
        List<Student> record=new ArrayList<>();

        record.add(new Student("sai", 30));
        record.add(new Student("Sai", 25));
        record.add(new Student("Bhargav", 20));
        record.add(new Student("Hello", 5));
        record.add(new Student("Kitty", 2));
        record.add(new Student("Horse", 17));
        record.add(new Student("Nord", 90));

        Collections.sort(record);
        System.out.println(record);


        List<Student> record2=new LinkedList<>();

        record2.add(new Student("sai", 30));
        record2.add(new Student("Sai", 25));
        record2.add(new Student("Bhargav", 20));
        record2.add(new Student("Hello", 5));
        record2.add(new Student("Kitty", 2));
        record2.add(new Student("Horse", 17));
        record2.add(new Student("Nord", 90));

        Comparator<Student> com =( o1, o2) -> o1.getName().compareTo(o2.getName());
        
        Collections.sort(record2,com);
        System.out.println(record2);

        String str="sai Bhargav";

        Stream s1=str.stream();
        System.out.println(s1);

    }
}
