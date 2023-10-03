package LinearDataStructures.DynamicDataStructures.LinkedList.main.java.yagiz.LinkedListDataStructure.FindingNodeCount;

import LinearDataStructures.DynamicDataStructures.LinkedList.main.java.yagiz.LinkedListDataStructure.Node;

public class FindingLengthOfLinkedListIterative {
    private Node head;
    
    public void push(int new_data){
        Node new_node=new Node(new_data); //Yeni bir data ekliyoruz
        new_node.next=head; //Yeni data'nın next'ini head olarak ayarlıyoruz. 
        head=new_node;  //head'i yeni bir düğüm ekleyebilmek için new_node olarak ayarlıyoruz.
    }

    public int getCount(){
        Node temp=head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args){
        FindingLengthOfLinkedListIterative obj=new FindingLengthOfLinkedListIterative();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        
        System.out.println("Count of nodes:\t"+obj.getCount());
    }
}
