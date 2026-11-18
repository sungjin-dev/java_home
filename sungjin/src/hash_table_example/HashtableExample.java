package hash_table_example;

import java.util.Hashtable;
import java.util.Map;



public class HashtableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();

        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        while (true) {
            System.out.println("아이디와 비밀번호 입력해");
            System.out.println("아이디");
            String id = scanner.nextLine();
            
            System.out.println("비밀번호: ");
            String id = scanner.nextLine();
            System.out.println();

            if(map.containsKey(id) {
                if(map.get(id).equals(pass))
            })
        }
    }
}
