package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Program başladı.");
        int a = 0;
        int b = 20;
        int c ;
        int[] arr = new int[2];
        try {
            System.out.println("Bölme işlemi");
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti");
            System.out.println("Bir değer giriniz :");
            c = scn.nextInt();
            arr[10] = 11;
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata alındı.");
            System.out.println(e.getMessage()); // Hatanın vurucu kısmını gösterir
            //e.printStackTrace();    // Hatanın hepsini gösterir.
        }catch(InputMismatchException e){
            System.out.println("Yanlış veri girildi.");
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array uzunluğu dışında bir değer girildi.");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Bu kısım kesinlikle çalışacak.");
        }

        System.out.println("Program bitti.");

    }

    // Try-Cath çalışma zamanında ki hataları çözüyor.
    // Try bloğunda hata olabilecek yeri yazıyoruz.
    // Cath'de hatayı yönetiyoruz.
    // Try-Cath maliyetli bir olaydır bu yüzden sadece hata olması yüksek olan yeri bloğun içerisine alıyoruz.
    // Exception sınıfı bütün hataları barındıran yapıdır.
    // Hatanın türüne göre exception yazabiliyoruz.
    // Exception e yazarsak bütün hataları yakalıyor o yüzden çok gereklimi tartışılır.
    // Finally konusu ise her koşulda çalışacak bir eylem.
}

