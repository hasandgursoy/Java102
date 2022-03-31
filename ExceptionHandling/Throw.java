package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class Throw {

    // Unutulmaması gereken şeyler
    // Hata fırlatttığımız bir method var ise onu throws Exception olarak tanımlayacağız.
    // Hataları yanyana yazadabiliyoruz.

    public static void checkCharacter(int character) throws CreateSpecialExpceiton{

        if(character < 15){
            throw new CreateSpecialExpceiton("Karaktersizsin.");
        }
        System.out.println("Karakter eksikliğiniz bulunamadı.");

    }

    public static void checkAge2(int age) throws IOException,ArithmeticException{
        if(age < 18){
            throw new IOException("Yaşınız tutmuyor");
            
        }
        System.out.println("Yaşınız uygundur.");
    }

    public static void checkAge(int age) throws Exception{
        if(age < 218){
            throw new Exception("Yaşınız tutmuyor");
            
        }
        System.out.println("Yaşınız uygundur.");
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz :");
        int age = scn.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Program Biti.");
        scn.close();

        try {
            checkCharacter(12);
        } catch (CreateSpecialExpceiton e) {
            System.out.println(e.getMessage());
        }


    }
}
