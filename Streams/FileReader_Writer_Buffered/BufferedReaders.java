package Streams.FileReader_Writer_Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class BufferedReaders {
    public static void main(String[] args) {
        
        // Bu zamana kadar gördüğümüz bütün yollardan en kalitelisi ve en yaygın olanı.
        // Her zaman bu şekilde kullanmamız lazım çünkü kolay ve güçlü.

        try {
            FileReader fileReader = new FileReader("Streams/FileReader_Writer_Buffered/patika.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String anotherData = "Selamlar Herkese Java 102 Bitiyor Çok heycanlıyım.";
        try {
            FileWriter fileWriter = new FileWriter("Streams/FileReader_Writer/patika.txt",Charset.forName("Big5"));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(anotherData);
            
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
