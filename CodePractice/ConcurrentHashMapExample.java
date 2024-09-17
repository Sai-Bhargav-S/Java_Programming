import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample{

    public static void main(String[] args) {
        Map<String, Integer> map =new ConcurrentHashMap<>();

        Thread thread1 = new Thread(() -> {
            map.put("Alice", 30);
            System.out.println(Thread.currentThread().getName() + " added Alice");
        });

        Thread thread2 = new Thread(() -> {
            map.put("Bob", 25);
            System.out.println(Thread.currentThread().getName() + " added Bob");
        });
        
        Thread thread3 = new Thread(() -> {
            map.put("Charlie", 35);
            System.out.println(Thread.currentThread().getName() + " added Charlie");
        });


        Thread thread4=new Thread(()->{
            map.put("Hola", 56);
            System.out.println(Thread.currentThread().getName()+" added Hola");
        }
        );


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Iterating over the ConcurrentHashMap
        System.out.println("\nFinal map content:");
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    
    }
    
}
