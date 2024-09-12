
class Student{
    private String name="Bhargav";
    private int age=45;

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

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}
public class DataEncapsulationExample {
    public static void main(String[] args) {
        Student student =new Student("Sai", 24);
        student.setAge(30);
        System.out.println(student.getName()+"---"+student.getAge());

    }

    
}
