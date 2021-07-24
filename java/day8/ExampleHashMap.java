package day8;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {


    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<String, String>();
        // key = value
        hm.put("Name" , "Laharitha");
        hm.put("City" ,"Hyderabad");

        System.out.println(hm.get("Name"));

        for(Map.Entry<String,String> s : hm.entrySet()) {
            System.out.println(s);

        }
    }
}
