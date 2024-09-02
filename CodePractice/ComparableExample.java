import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
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
    

    public int compareTo(Student that) {
        if(this.age<that.age){
            return 1;
        }else{
            return -1;
        }
    }

}

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> record=new ArrayList<>();

        record.add(new Student("Sai", 25));
        record.add(new Student("Bhargav", 20));
        record.add(new Student("Hello", 5));
        record.add(new Student("Kitty", 2));
        record.add(new Student("Horse", 17));
        record.add(new Student("Nord", 90));

        Collections.sort(record);
        System.out.println(record);


        
    }
    
}
