package Streams.File;
import java.io.File;
import java.io.IOException;

public class FileClasss {

    public static void main(String[] args) {
        
        // Var olan bir dizine birşeyler ekledik 
        File dosya = new File("Streams/patika.txt");
        try {
            if(dosya.createNewFile()){
                System.out.println(dosya.getName()+" dosyası oluşturuldu");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // Olmayan dizine birşeyler ekleyelim
        File anotherDoc = new File("Streams/Eng");
        anotherDoc.mkdir(); // Klasör yarattık.

        File ddd = new File("Streams/Eng/ddd.txt");
        try {
            ddd.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Dizindeki klasörleri yapıları listeleyim
        File dizin = new File("Streams");
        String[] list = dizin.list();

        for (String string : list) {
                System.out.println(string);
        }

        // Oluşturulan dosyaların temizlenmesi
        dosya.delete();
        ddd.delete();
        anotherDoc.delete();
        
        
    }

}