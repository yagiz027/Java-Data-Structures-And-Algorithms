package LinearDataStructures.DynamicDataStructures.Stack.main.java.yagiz;

import java.util.Stack;

public class StackMain {
    static Stack<Integer> textStack=new Stack<>();
    public static void main(String[] args){
        pushStack(textStack);
        popStack(textStack);
        pushStack(textStack);
        peekStack(textStack);
        searchStack(textStack, 0);
        searchStack(textStack, 3);
    }

    public static void pushStack(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }   
    }

    public static void popStack(Stack<Integer> stack){
        
        System.out.println("Pop Operation:");
        for(int i=0;i<5;i++){
            Integer y= (Integer) stack.pop();
            System.out.println(y);
        }
    }
    public static void peekStack(Stack<Integer> stack){
        Integer element=(Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    public static void searchStack(Stack<Integer> stack,int element){
        Integer pos=(Integer) stack.search(element);
        
        if(pos==-1){
            System.out.println("Element not found");
        }else
            System.out.println("Element is found at position: " + pos);
    }
}
