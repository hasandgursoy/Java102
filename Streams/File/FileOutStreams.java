package Streams.File;

import java.io.FileOutputStream;

public class FileOutStreams {
    public static void main(String[] args) {
        
        // OutputStream dosyaya veri yazmaya yarıyor ancak Stringi byte'a çevirmeden atamıyoruz.

        String yazi = "OutPutStream ogreniyorum. \n Patika.dev";

        try {
            FileOutputStream output = new FileOutputStream("Streams/File/Patika.txt",true); // true append ediyor gelen veriyi dosyanın üzerine yazıyor.
            // FieOutPutStream de eğer olmayan dosya adı girersek onu bize oluşturur.
            // Stringi byte'a convert ediyoruz ilk önce.
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);

            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
