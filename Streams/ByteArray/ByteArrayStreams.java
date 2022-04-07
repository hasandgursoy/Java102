package Streams.ByteArray;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayStreams {
    public static void main(String[] args) {
        
        // Güvenlik yapılarında kullanılıyor. Projenin güvenlikle alakalı sınıfların bu Stream kullanılıyor.

         byte[] dizi = {1,2,3,54,66,51,12,53,67,12};
         ByteArrayInputStream inputStream = new ByteArrayInputStream(dizi,0,6); // 0 dan 6 ya kadar getir diyoruz.
         
         int i = inputStream.read();
         while (i != -1) {
             System.out.println(i);
             i = inputStream.read();
         }

         try {
            inputStream.close(); // Stream kapatıyoruz her zaman çünkü hafızada yer tutuyor ve meşgul etmemesi lazım.
        } catch (IOException e) {
            e.printStackTrace();
        }

         

    }
}
