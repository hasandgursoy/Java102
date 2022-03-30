package NestedClassesAndGenerics.Generics;

public class Student<T> implements IDatabase<T>{

    @Override
    public boolean add(T data) {
        System.out.println("Data added.");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Data deleted.");
        return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Data updated.");
        return false;
    }

    @Override
    public T select() {
        System.out.println("Data selected.");
        return null;
    }
    
}
