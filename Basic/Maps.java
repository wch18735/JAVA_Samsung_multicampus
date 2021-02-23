package Basic;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Java: Map => Python: Dictionary
        // TreeMap need to put same data types (automatically sort)
        // LinkedHashMap (Maintain inserted order)
        Map m = new HashMap();

        // Key, Value
        m.put("tim", 6);
        m.put("tom", 8);
        m.put("any", 16);

        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsValue("7"));
    }
}
