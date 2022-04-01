package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println(list.get(1));
        list.set(2, 15);

        // Overloading Add yakaladım.
        list.add(3,15);
        System.out.println(list.get(1));
        int deger =list.remove(1);
        System.out.println(deger);

        // Sublist 

        List<Integer> list2 = list.subList(2, list.size());
        System.out.println(list2);

        // List to Array

        Object[] arr = list.toArray();
        List<Object> ss = Arrays.asList(arr);
        
    }   


}
