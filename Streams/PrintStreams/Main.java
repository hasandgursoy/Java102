package PrintStreams;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        
        // Çıktı verilerini byte yerine direk olarak metine çeviren koca yürekli bir yapı.

        try {
            PrintStream outPut = new PrintStream("Streams/Print/print.txt");
            outPut.print("Selamlar");
            outPut.print(1231231); // integer değer girsek de farketmiyor.
            outPut.print(" Umarım çok iyisinizdir.");
            outPut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
