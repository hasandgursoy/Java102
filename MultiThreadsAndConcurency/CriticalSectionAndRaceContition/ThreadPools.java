package MultiThreadsAndConcurency.CriticalSectionAndRaceContition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools {
    public static void main(String[] args) {
        
        OrderMatic o1 = new OrderMatic();
        List<Thread> islemler = new ArrayList<>();

        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            service.execute(o1);
        }
        

        


    }
}
