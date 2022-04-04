package FileReader_Writer_Buffered;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class Main {
    
    public static void main(String[] args) {
        
        // Okuma sınıflarında daha önceleri yaptığımız şeyleri tek satırda yapmamızı sağlıyor.
        // Yazma sınıfıda aynı şekilde daha öncekilerin hepsini barındıırıyor bunu kullanıyoruz o yüzden.
        
        String data = "JAVA ÖĞRENİYORUM";
        try {
            
            FileReader readFile = new FileReader("Streams/FileReader_Writer/patika.txt",Charset.forName("Big5"));
            int i = readFile.read();
            while(i != -1){
                System.out.println((char) i);
                i = readFile.read();
            }
            readFile.close();
            FileWriter fileWriter = new FileWriter("Streams/FileReader_Writer/patika.txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
