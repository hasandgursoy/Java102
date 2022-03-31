package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    
    public static void main(String[] args) {
        
        // LinkedHash setin HashSet'den farkı 
        // HashSet'e giren değerlerin doğru sırada çıkması çok düşük ihtimal ancak LinkendHashSet'de böyle bir durum yok.
        // Yani öğeler eklendikleri sıra ile döner.
        
        LinkedHashSet<String> days = new LinkedHashSet<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        Iterator<String> itr = days.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }


}
