package Maps.main.java.yagiz;

import java.util.Hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        Hashtable<String,String> table=new Hashtable<>();
        table.put("a","A");
        table.put("b","B");
        table.put("c","C");
        table.put("d","D");
        table.put("e","E");
        table.put("f","F");

        System.out.println(table);
    }
}
