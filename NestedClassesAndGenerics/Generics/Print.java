package NestedClassesAndGenerics.Generics;

public class Print {
    
    public static <T> void printArray(T[] arr){

        for(T t : arr){
            System.out.println(t);
        }

    }

}
