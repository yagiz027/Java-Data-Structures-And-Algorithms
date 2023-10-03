package AlgorithmProblems.SortArrayByParity;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("PLease enter the length of Array:");
        int n=scanner.nextInt();
        int[] arr=new int[n];

        System.out.print("Please enter the elements of Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Sorted Array: " + Arrays.toString(sortArrayByParity(arr)));
        scanner.close();
    }
    
    private static int[] sortArrayByParity(int[] arr) {
        int result[] = new int[arr.length];
        int p=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0){
                result[p]=arr[i];
                p++;
            }
        }

        for(int i=0; i<result.length;i++){
            if(arr[i]%2!=0){
                result[p]=arr[i];
                p++;
            }
        }
        return result;
    }
}
