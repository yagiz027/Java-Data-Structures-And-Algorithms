package LinearDataStructures.DynamicDataStructures.LinkedList.main.java.yagiz.LinkedLİstCollectionFramework.BasicOpertionsAndMethodsLinkedLİst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListOperations {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        list.add("A");  //Listeye ekleme işlemi yapar.
        list.add("B");
        list.addLast("C"); //Listeye sondan ekleme işlemi yapar
        list.addFirst("D"); //Listeye baştan ekleme işlemi yapar
        list.add(2, "E");   //Listeye belirtilen index'den ekleme işlemi yapar

        list.set(0, "ABC"); //Listede belirtilen index'deki elemanı günceller.

        list.remove("B"); //Listeden belirtilen elemenı siler.
        list.remove(3); //Listeden belirtilen index'deki elemanı siler.
        list.removeFirst(); //Listedeki ilk elemanı siler.
        list.removeLast();  //Listedeki son elemanı siler.


        list.addAll(new ArrayList<>(List.of("a","b","c","d"))); //Listeye belirtilen dizi'yi ekler.
        
        list2=(LinkedList) list.clone(); // Listeyi belirtilen listeye klonlar.
        list.clear(); //Listeyi içini tamamen temizler.
        System.out.println("Does the List contains 'b':"+ list2.contains("b")); //Listede belirtilen eleman var mı diye kontrol eder.

        Iterator<String> x=list2.descendingIterator(); //Listeyi tersten yazdırır.
        while(x.hasNext()){
            System.out.println("Value:"+x.next());
        }

        System.out.println("Head of List:"+list2.element());//Listedeki ilk elemanı yazıdır.
        System.out.println("First List:"+ list);
        System.out.println("Second List:"+list2);
        System.out.println("3th value of list:"+list2.get(3)); //Listede belirtilen index'deki elemanı alır.
        System.out.println("First value of list:"+list2.getFirst()); //Listede bulunan ilk elemanı döndürür. 
        System.out.println("Last value of list:"+list2.getLast()); //Listede bulunan son elemanı döndürür.
        System.out.println("This is the index number of the given value(A):"+list2.indexOf("A")); //Listede parametre olarak girilen değerin index numarasını döndürür.
    }
}
