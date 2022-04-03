package File;

import java.io.FileInputStream;

public class FileInputStreams {
    public static void main(String[] args) {

        // Biz bir dosyadan veri okumak istiyorsak FileInputStream kullanıyoruz.
        // Verileri byte byte okuyoruz.

        try {
            FileInputStream inputStream = new FileInputStream("Streams/File/patika.txt");
            System.out.println(inputStream.available()); // Kaç tane karakter var bakar. Ancak her read() den sonra bytelar eksilir en sondakinde 0 yazıcak.
            inputStream.skip(15); // içerisine verilen parametre kadar byte karakteri atlar.
            int i = inputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStream.read();
            }
            System.out.println(inputStream.available()); // EN SON 0 TANE GÖSTERİCEK.
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // read() byte byte okumamızı sağlar. Her okunuştan sonra bir sonrakine geçer.

    }
}
