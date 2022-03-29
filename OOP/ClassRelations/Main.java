package OOP.ClassRelations;

public class Main {
    public static void main(String[] args) {
        Instructor i1 = new Instructor("Jane", "Loa", "Chemical");
        Student s1 = new Student("Hasan", "Gürsoy", "123", "Istanbul",-250);
        Student s2 = new Student("Patika", "Dev", "321", "Istanbul",-10);
        System.out.println(s1.getNote());

        s2.setNote(-105);
        System.out.println(s2.getNote());

        // Yukarıda - değer girilmesini engelledik hem set.. methodu içinde hemde construcor içinde.

        Student[] students = {s1,s2};

        // Dependency = 'uses a' ilişkisi var şuan burda başka bir sınıfa ait değerleri hesaplattık.
        // Composition = 'has a'  ilişkisi de var çünkü parametre olarak başka bir sınıfdan değer almış.
        // Inheritance = 'is a' ilişkisi bu örnekde yok çünkü herhangi bir kalıtım yapmadık.
        Course mat = new Course("Mat101", "MAT",i1);
        mat.calcAvarage(students);

        


    }
}
