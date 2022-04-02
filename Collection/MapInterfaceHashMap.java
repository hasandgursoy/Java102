package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterfaceHashMap {
    
    public static void main(String[] args) {
        



        Map<String,String> country = new HashMap<>();

        country.put("TR", "Türkiye");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

        System.out.println(country.get("TR"));

        for (String key : country.keySet()) {
            System.out.println(key);
            System.out.println(country.get(key));
        }

        for (String val : country.values()) {
            System.out.println(val);
        }

        for (Entry<String, String> string : country.entrySet()) {
                System.out.println(string);
        }

    }

}
