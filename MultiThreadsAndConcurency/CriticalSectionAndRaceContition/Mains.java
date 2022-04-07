package MultiThreadsAndConcurency.CriticalSectionAndRaceContition;
import java.util.ArrayList;
import java.util.List;

public class Mains {
    public static void main(String[] args) {
        
        OrderMatic o1 = new OrderMatic();
        List<Thread> islemler = new ArrayList<>();

        
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(o1);
            islemler.add(t);
            t.start();
        }

        for (Thread thread : islemler) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(o1.getOrderNo());
    }
}
