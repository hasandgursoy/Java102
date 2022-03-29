package OOP.Encapsulation;

// Encapsulation
// Inheritance
// Polimorphism
// Abstraction

// Sınıfa ait değişkenlerin yapıların koruma kalkanı gibi düşünülebilir encapsulation
// Verilerin anlamsız hale gelmesini engelleyen bir yapıdır.
// Bunları yapabilmek için getter ve setter şart . Getter Ve Setter içinde kontroller yapılıp verilerin anlamsızlaşmasını engelleriz.

public class Main {
    
    public static void main(String[] args) {
        
        Book harryPotter = new Book("Harry Potter",150);
        System.out.println(harryPotter.getName()+harryPotter.getPageNumber());
        Book lordOfTheRings = new Book("Lord Of The Rings",-100);
        System.out.println(lordOfTheRings.getPageNumber());

        lordOfTheRings.setPageNumber(250);
        System.out.println(lordOfTheRings.getPageNumber());


        

    }


}
