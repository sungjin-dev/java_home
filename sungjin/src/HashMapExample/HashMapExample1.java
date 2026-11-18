package HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: " + map.size());
        
        System.out.println("\t홍길동 : " + map.get("홍길동"));
        System.out.println();
        
        Set<String> KeySet = map.keySet();
        Iterator<String> KeyIterator = KeySet.iterator();
        while (KeyIterator.hasNext()) {
            String key = KeyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key+ ":" + value);
        }
        System.out.println();
        
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIteratort = entrySet.iterator();
    }
}
