package OOP.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar Giriniz : ");
        double price = input.nextDouble();

        System.out.print("Kart No Giriniz :");
        String cardNumber = input.next();

        System.out.print("Son Kullanım Tarihi Giriniz :");
        String expDate = input.next();

        System.out.print("Güvenlik Kodu Giriniz :");
        String cvc = input.next();

        System.out.println("1. A Aankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka Seçiniz :");
        int selectBank = input.nextInt();

        switch (selectBank) {
            case 1:
                ABank aPos = new ABank("A", "12313213", "7986542364");
                aPos.connect("123");
                aPos.payment(price, cardNumber, expDate, cvc);
                break;
            case 2:
                BBank bPos = new BBank("B","23213123","123123123");
                bPos.connect("123");
                bPos.payment(price, cardNumber, expDate, cvc);
                break;


            default:
                System.out.println("Geçerli banka giriniz !");
                break;
        
            
            }

        input.close();
    }
}
