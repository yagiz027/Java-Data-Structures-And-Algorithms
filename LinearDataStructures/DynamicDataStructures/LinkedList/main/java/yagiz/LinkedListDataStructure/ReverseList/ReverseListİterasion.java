package LinearDataStructures.DynamicDataStructures.LinkedList.main.java.yagiz.LinkedListDataStructure.ReverseList;

import LinearDataStructures.DynamicDataStructures.LinkedList.main.java.yagiz.LinkedListDataStructure.Node;

public class ReverseListİterasion {
    Node head;
    
    public Node reverse(Node node){
        Node prev=null;
        Node current=node;
        Node next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }

    public void printList(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    
    public static void main(String[] args) {
        ReverseListİterasion reverseListİterasion=new ReverseListİterasion();
        reverseListİterasion.head=new Node(85);
        reverseListİterasion.head.next=new Node(45);
        reverseListİterasion.head.next.next=new Node(23);
        reverseListİterasion.head.next.next.next=new Node(12);

        System.out.println("Given linked list:");
        reverseListİterasion.printList(reverseListİterasion.head);
        reverseListİterasion.head=reverseListİterasion.reverse(reverseListİterasion.head);
        System.out.println(" ");
        System.out.println("Reversed linked list:");
        reverseListİterasion.printList(reverseListİterasion.head);
    }
    
}
