package exam04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user01", "이이름");
        members.put("user02", "김이름");
        members.put("user03", "박이름");

        members.put("user02", "(수정)김이름");

        ///members.remove("user02");

        //String name = members.get("user02");
        //System.out.println(name);

        Set<Map.Entry<String, String>> entries = members.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.printf("key=%s, value=%s%n", entry.getKey(), entry.getValue());
        }


        Set<String> keys = members.keySet();

    }
}
