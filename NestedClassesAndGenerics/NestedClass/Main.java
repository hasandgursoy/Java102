package NestedClassesAndGenerics.NestedClass;

public class Main {
    public static void main(String[] args) {
        
        // Nested Class (İç İçe Sınıflar)
        //  - Inner Class (İç Sınıflar)
        //      - static 
        //      - non-static
        //  - Local Class (Yerel Sınıflar)
        //  - Ananymus Class (Anonim Sınıflar)

        Out o = new Out();
        o.run();

        // I want to show very diffrent tactic creating a nested object 

        Out os = new Out();
        Out.In ins = os.new In();
        ins.run();

        // Another reaching way 

        Out.In anotherIn = os.getIn();
        anotherIn.run();

        // If In class is static no need for newly created object
        Out.NewIn.run();

        // =================================================================
        
        // Local Class
        // Local class = if the class is inside method, it is the local class
        Local l = new Local();
        l.run();
        
        // Anonim Class
        // If we make changes in curley brackets (@Overriding) after the object created , it is the anonim class
        Anonim anonim = new Anonim(){

            @Override
            public void run() {
                System.out.println("Anonim olarak yazılmış run methodu !");
            }

        };

        anonim.run();



    }
}
