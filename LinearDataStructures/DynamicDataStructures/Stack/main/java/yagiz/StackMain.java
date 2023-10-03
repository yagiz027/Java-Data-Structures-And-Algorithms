package LinearDataStructures.DynamicDataStructures.Stack.main.java.yagiz;

import java.util.Random;
import java.util.Stack;

public class StackMain {
    static Random rnd=new Random();
    static Stack<Integer> textStack=new Stack<>();
    public static void main(String[] args){
        popStack(textStack);
    }

    public static void pushStack(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(rnd.nextInt(100));
        }   
    }

    public static void popStack(Stack<Integer> stack){
        int y=0;
        for(int i=0;i<5;i++){
            y= (Integer) stack.pop();
            System.out.println(y);
        }
    }
    public static void peekStack(Stack<Integer> stack){

    }
}
