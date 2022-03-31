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
        Character[] cshar ={'J','A','V','A'};

        Print.printArray(arr);
        Print.printArray(intArr);
        Print.printArray(cshar);

        Student<String> stu = new Student<>();
        stu.add("Hasan");
        stu.delete("SSS");
        stu.update("New Version");
        stu.select();


        // Bounded Types

        // Integer,Double,Float extends Number
        // Although it is of type T, we have limited it to only take number expressions
        Integer realNull = null;
        Nullable<Integer> nom = new Nullable<Integer>(realNull);
        nom.run();

        

    }
    

   

}
