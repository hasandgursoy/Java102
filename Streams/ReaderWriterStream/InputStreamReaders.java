package ReaderWriterStream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaders {
    public static void main(String[] args) {
        
        // Eski yolda FileInputStream oluşturup sonrasında file.read() diyoduk while ile dönüyoduk.
        // Ve tip dönüşümü yapmak zorundaydık (char)Byte ve bu durum başka dildeki charsetleri bozuyordu.
        // Ben bu dosyada belki çince belki rusça yazılar bulundurmak istiyorum
        // Bu yüzden InputStreamReader oluşturuyoruz.

        // Yeni Yol = InputStreamReader
        try {
            FileInputStream fileInputStream = new FileInputStream("Streams/ReaderWriterStream/patika.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            System.out.println(inputStreamReader.getEncoding()); // UTF 8



            int i = inputStreamReader.read();
            inputStreamReader.close();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStreamReader.read();
            }


        }catch (Exception e) {
            e.printStackTrace();
        }
       

    }
}
