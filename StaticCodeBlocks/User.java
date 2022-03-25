package StaticCodeBlocks;

public class User {
    
    public String name;
    public static int counter = (int) (Math.random() * 10);


    public User(String name){
        this.name = name;
        System.out.println(counter);
    }

    // Static Code Blokları
    // Static yazmaz isek her nesne yaratıldığında çalışır
    // Pek kullanılan bir yöntem değil.
    static {
        System.out.println("Ben bir static kod bloğuyum");
        if(counter < 5){
            counter+=3;
        }
    }



}
