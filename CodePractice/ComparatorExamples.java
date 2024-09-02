import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class ComparatorExamples {

    public static void main(String[] args) {

          List<Student> record=new ArrayList<>();

        record.add(new Student("Sai", 25));
        record.add(new Student("Bhargav", 20));
        record.add(new Student("Hello", 5));
        record.add(new Student("Kitty", 2));
        record.add(new Student("Horse", 17));
        record.add(new Student("Nord", 90));

        Comparator<Student> com =( o1,  o2) -> (o1.getAge()>o2.getAge())?1:-1;

        Collections.sort(record,com);
        System.out.println(record);
        
    }
    
}
