package BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        // Buffered Stream veriler çoğalınca okunmasını ve yazmasını kolaylaştıran bir yapıdır.

        try {
            FileInputStream fileInputStream = new FileInputStream("Streams/BufferedStream/patika.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i != -1) {
                System.out.print((char)i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        String data = "I want to learn english.";
        try {
            FileOutputStream fileOutStreams = new FileOutputStream("Streams/BufferedStream/patika.txt",true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutStreams);

            byte[] byteArray = data.getBytes();

            bufferedOutputStream.write(byteArray);
            
            
            bufferedOutputStream.close();
            fileOutStreams.close();
       
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
