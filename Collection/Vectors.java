package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
    
    public static void main(String[] args) {
        
        // Vectors are old struct. Collections are best man.
        // Vectors have bad performance.

        Vector<String> vector = new Vector<>();

        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İstanbul");
        vector.add("İzmir");


        Iterator<String> itr = vector.iterator();


        while (itr.hasNext()) {
            System.out.println(itr.next());
        }





    }

}
