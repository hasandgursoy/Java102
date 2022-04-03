package Collection;


import java.util.*;

import Collection.Student;


public class LinkedMapAndTreeMap {

    public static void main(String[] args) {

        // LinkedHashMap<Integer,Student> students = new LinkedHashMap<>();

        TreeMap<Integer,Student> students = new TreeMap<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                return o1-o2;
            }
            
        }.reversed());

        students.put(101, new Student("Hasan",100));
        students.put(102, new Student("Selim", 1000));

        for (Student stu : students.values()) {
            System.out.println(stu.getName());
        }


    }
    
}