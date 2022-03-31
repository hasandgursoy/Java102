package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceHashSet {
    

    public static void main(String[] args) {
        
        // a => 1789879797545
        // b => 1132313213223
        // h[1231231231231] = a, f(a) => 12312351231
        // Yukarıdaki olay şu h[] arrayinin içindeki değer f(a) fonksiyonuna denk geliyor bu şu demek.
        // Tekrar a değeri geldiğinde hafızadaki alanın üstüne yeni a değerini yazıyor böylece ondan sadece bir tane olmasını sağlıyoruz.

        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(15);
        hSet.add(20);
        hSet.add(10);
        hSet.add(10);

        System.out.println(hSet.size());

        for (Integer integer : hSet) {
            System.out.println(integer);
        }

        hSet.forEach((t) -> System.out.print(t));

        // İterator'ın mantığı şu eğer hangi türde döneceğini söylüyorum <Integer>
        // Daha sonra dönmek istediğimiz veriyi param.iterator() diyoruz.
        // En sonunda eğer itr.hasNext() yani değer var ise itr.next() diyip değere ulaşabiliyoruz.

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        

    }



}
