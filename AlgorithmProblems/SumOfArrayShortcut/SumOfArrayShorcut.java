package AlgorithmProblems.SumOfArrayShortcut;

import java.util.Arrays;

public class SumOfArrayShorcut {
    public static void main(String[] args){
        System.out.println("Array: "+ Arrays.toString(new int[] {3,1,2,4}));
        System.out.println("Sum of Array: " + sumArray(new int[]{3,1,2,4}));
    }
    
    private static int sumArray(int[] arr) {
        int total = Arrays.stream(arr).sum();
        return total;
    }
}
