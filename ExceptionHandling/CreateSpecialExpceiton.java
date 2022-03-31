package ExceptionHandling;

public class CreateSpecialExpceiton  extends Exception{

    public CreateSpecialExpceiton(String message) {
        super(message);
        System.out.println("Karaktersiz olduğunuz ispatlandı.");
    }
    
    // İlk yapmam gereken şey neleri constructor ekleyebiliyoruz bakmak.
    // Kendi hata sınıfımızı yazabiliyoruz.

    @Override
    public String toString(){
        return "Bu AgeCheck sınıfına ait bir Exception !";
    }

}
