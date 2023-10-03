package AlgorithmProblems.TwoNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumbersMain {
    public class Node{
        int data; 
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node head;

    public void push(int data){
        Node new_node=new Node(data); 
        new_node.next=head;
        head=new_node;
    }

    public Node reverse(Node node){
        if (head == null || head.next == null)
        return head;

        Node rest = reverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }

    public void printList(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }


    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the lenghts of the lists: ");
        int lengthsOfLists= scanner.nextInt();
        int[] elementsOfFirstList=new int[lengthsOfLists];
        int[] elementsOfSecondList=new int[lengthsOfLists];
        TwoNumbersMain twoNumbersMain=new TwoNumbersMain();

        System.out.println("Please enter the elements of the first list: ");
        for(int i=0;i<lengthsOfLists;i++){
            elementsOfFirstList[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(elementsOfFirstList));
        
        System.out.println("Please enter the elements of the second list: ");
        for(int i=0;i<lengthsOfLists;i++){
            elementsOfSecondList[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(elementsOfSecondList));

        scanner.close();
    }
    
}
