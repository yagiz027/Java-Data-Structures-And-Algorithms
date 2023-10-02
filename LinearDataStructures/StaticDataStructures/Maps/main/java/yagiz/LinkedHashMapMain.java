package Maps.main.java.yagiz;

import java.util.LinkedHashMap;

public class LinkedHashMapMain {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Yağız", 22);
        linkedHashMap.put("Berk", 23);
        linkedHashMap.put("Ensar", 24);
        linkedHashMap.put("Selim", 25);

        System.out.println(linkedHashMap);
    }
}
