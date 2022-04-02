package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queques {
    
    public static void main(String[] args) {
        
        // Queque = FIFO
        // Polimorfizm örneği
        // Queque de get methodu yok bu yüzden bütün listeyi dönmemiz lazım.
        // LinkedList hem queque den miras alıyor hemde AbstractList'den o yüzden ikisi gibi de davranabiliyor.
        // Queque istiyorsak que diyecez list istiyorsak sadece linked list diyecez.


        Queue<String> q = new LinkedList<>();
        q.add("Hasan");
        q.add("Gürsoy");
        q.offer("Patika"); // add ile aynı şey
        q.remove("Hasan");

        q.element(); // kuyruğun başındaki elemanı verir.
        System.out.println(q.poll()); // kuyrakdan elemanı çıkarır en baştaki sonra onu geri döner.

        Iterator<String> itr = q.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }




    }

}
