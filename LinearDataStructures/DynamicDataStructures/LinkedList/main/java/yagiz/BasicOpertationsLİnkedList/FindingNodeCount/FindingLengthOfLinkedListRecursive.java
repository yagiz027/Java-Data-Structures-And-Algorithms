package LinearDataStructures.DynamicDataStructures.LinkedList.main.java.yagiz.BasicOpertationsLİnkedList.FindingNodeCount;

import LinearDataStructures.DynamicDataStructures.LinkedList.main.java.yagiz.BasicOpertationsLİnkedList.Node;

public class FindingLengthOfLinkedListRecursive {
    private Node head;

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public int getCount(){return getCounRec(head,0);}

    private int getCounRec(Node node, int count) {
        if (node == null) {
            return count;
        }

        return getCounRec(node.next, 1 + count);
    }

    public static void main(String[] args) {
        FindingLengthOfLinkedListRecursive ll = new FindingLengthOfLinkedListRecursive();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        
        System.out.println("Count of nodes:"+ll.getCount());
    }
}
