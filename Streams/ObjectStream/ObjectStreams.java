package ObjectStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreams {

    public static void main(String[] args) {

        // Nesne Okuma-Yazma Akışları
        // Normalde objeleri output yaptığımız zaman onları geri okumak da zorlanırız.
        // Bu konuda serialization API devreye girer ve işimizi kolaylaştırır.
        // Bunun için Serialization implement edilmesi gerekir.
        // Sonra FileOutPut oluşturuyoruz oluşturulan dosyayı ObjectOutPut'a veriyoruz.
        // En son objeyi output.writeObjec(obje); bu şekilde yazdırıyoruz.
        // Okumak içinde FileInputStream dosya oluşturulacak ve sorna ObjectInput'a aktarılacak.
        // En sonunda Objeye cast edilen değer yapılacak.
        // En son Objenin get methodundan okuyabiliriz.
        File doc = new File("Streams/ObjectStream/araba.txt");
        Car c1 = new Car("Auidi", "A3");
       
        // OutPut

        try {

            FileOutputStream outputStream = new FileOutputStream("Streams/ObjectStream/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputStream);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Input

        try {
            FileInputStream inputFile = new FileInputStream("Streams/ObjectStream/araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject(); 
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
