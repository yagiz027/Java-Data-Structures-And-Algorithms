package Maps.main.java.yagiz;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMain {
    static Map<String, String> map = new ConcurrentHashMap<String,String>(); 
    public static void main(String[] args) {
       map.put("Turkey", "+90");
       map.put("USA","+1");
       map.put("France","+33");
       map.put("Italy", "+39");

       System.out.println(map.values());
    //    entrySetSearching();
    //    keySearching();
       iteratorSearching();
    }

    public static void entrySetSearching(){
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("Country Name:" + entry.getKey() + " => Phone Code:" + entry.getValue());
        }
    }

    public static void keySearching(){
        for(String key: map.keySet()){
            System.out.println("Country Name:" + key);
        }
    }   

    public static void iteratorSearching(){
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("Country Name:" + entry.getKey() + " => Phone Code:" + entry.getValue());
        }
    }
    
}
