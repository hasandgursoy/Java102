package PrintWriters;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) {
        
        // Herşeyi Stringe Çeviren bir yapı 

        String data = "Java 102";

        PrintWriter writer;
        try {
            writer = new PrintWriter("Streams/PrintWriters/patika.txt");
            writer.print(12312);
            writer.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
   




    }

}
