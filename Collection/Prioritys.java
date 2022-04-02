package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prioritys {

    public static void main(String[] args) {

        // Anonim yapı içerisinde comparator kullandık bu önemli bir örnek.
        // PriortiyQueue'lar sıralanma imkanı verirler.
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        }.reversed());

        q.add("Hasan");
        q.add("ÇetinDağ");
        q.add("Ahmet");
        q.add("Ali İhsan");

        q.forEach((t) -> System.out.println(t));

        System.out.println(q.element());


    }


}
