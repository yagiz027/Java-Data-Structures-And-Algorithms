package Maps.main.java.yagiz;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Yağız", 22);   //HashMap'e yeni bir nesne ekelemek için kullanılır.
        map.put("Berk",23);
        map.put("Ensar", 24);
        map.put("Selim", 25);
        map.compute("Yağız", (t, u) -> Integer.valueOf(23)); //HashMap içerisindeki nesnesinin key yada value'sunu güncellemek için kullanılır.
        
        System.out.println(map.hashCode());               //HashMap'in hashCode'unu döndürür.
        System.out.println(map.get("Yağız"));         //HashMap İçerisinde anahtar (key) değeri verilen nesnenin value'sunu verir.
        System.out.println(map.containsKey("Yağız")); //HashMap içerisinde belirtilen anahtar (key) var mı diye kontrol eder.
        System.out.println(map.containsValue(25));  //HashMap içerisinde belirtilen değer (value) var mı diye kontrol eder.
        System.out.println(map.size());     //HashMap'in boyutunu verir.    
        System.out.println(map.isEmpty());  //HashMap'in boş olup olmadığını kontrol eder. 
        System.out.println(map.keySet());   //HashMap içersinde bulunan anahtarları Set şekilde yazmak için kullanılır.
        System.out.println(map.values());   //HashMap içerisinde bulunan değerleri Set şeklinde yazmak için kullanılır.
        System.out.println(map.entrySet()); //HashMap içerisinde bulunan aynı öğelerden bir Set oluşturmak için kullanılır.

        System.out.println(map);
    }
}
