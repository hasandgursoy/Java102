package ReaderWriterStream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OutPutStreamWriters {
    public static void main(String[] args) {
        
        // Diğer Streamlerden  byte larla uğraşmıyorsun.

        String data = "ĞÜŞİ";
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("Streams/ReaderWriterStream/Patika.txt",true);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.write(data.getBytes(Charset.forName("Big5")));
            

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(data);
            System.out.println(outputStreamWriter.getEncoding());

            outputStreamWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
