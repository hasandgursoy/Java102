package ByteArray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreams {
    public static void main(String[] args) {
        
        // Stringi byte döndürmek zorundayız.

        String data = "Java 102 Dersleri";

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Çıkış Akışı "+newData);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
