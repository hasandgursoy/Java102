package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    
    public static void main(String[] args) {

        List<String> liste = new LinkedList<>();
        liste.add("Hasan");
        liste.add("Gürsoy");
        liste.add("Java");
        liste.add("102");

        Iterator<String> itr = liste.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.hasNext());
        }

        liste.forEach((t) -> System.out.println(t));

        // ArrayList ile LinkedList in farkı arka planda var.
        // Bir listenin ortasına vs eleman ekliceksek linkedList daha performanslı.
        // ArrayListelerde search algoritmalarında daha kuvvetli ve performanslı.




    }

}
