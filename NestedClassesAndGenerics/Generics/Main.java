package NestedClassesAndGenerics.Generics;

public class Main {
    
    public static void main(String[] args) {
        
        // Undifined
        //String s;

        // Null
        //String s1 = null;

        // Empty
        //String s2 = "";

        // We need to write a class that checks if all data types are null
        Nullable<Integer> n = new Nullable<Integer>(10);
        System.out.println(n.getValue());
        n.run();

        Integer a = 10;
        String b = "patika";
        Double d = 3.14;

        Test<Integer,String,Double> t = new Test<>(a,b,d);

        t.showInfo();

        String[] arr = {"Java","102","Patika","Dev"};
        Integer[] intArr = {1,2,3,4};
        Character[] c ={'J','A','V','A'};

        Print.printArray(intArr);
    }

   

}
