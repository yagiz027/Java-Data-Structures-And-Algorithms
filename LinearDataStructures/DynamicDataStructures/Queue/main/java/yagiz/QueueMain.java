package LinearDataStructures.DynamicDataStructures.Queue.main.java.yagiz;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main (String[] args){
        Queue<String> queueList=new PriorityQueue<>();
        queueList.add("A"); //Kuyruğa bir eleman ekler eğer kuyruk dolu ise bir istisna fırlatır.
        queueList.add("B"); 
        queueList.offer("C");
        queueList.add("D");
        queueList.add("E");

        String front=queueList.remove(); //Kuyruğun başından bir elemenı siler. Eğer içerine parametre olarak bir eleman girersek, belirtilen elemanı siler.

        System.out.println("Removed Element: "+ front);
        System.out.println("New Queue after removing operation: " + queueList);
    }

}
