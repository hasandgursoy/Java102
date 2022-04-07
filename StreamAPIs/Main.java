package StreamAPIs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // StreamAPI'ler functional programingden sonra ortaya çıkan işimizi baya kolaylaştıran yapılar

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(23);
        list.add(45);
        list.add(17);
        list.add(90);
        list.add(90);
        list.add(90);
        
        System.out.println("ForEach");
        //ForEach
        list.stream().forEach(i->System.out.println(i));

        System.out.println("Filter");
        //Filter (60 dan büyük olanları yazdır.)
        list.stream().filter(num -> num >60).forEach(num ->System.out.println(num));

        System.out.println("Distance");
        //Distance (tekrar eden sayıları yazmaz.)
        list.stream().distinct().forEach(i->System.out.println(i));



        


    }
}
