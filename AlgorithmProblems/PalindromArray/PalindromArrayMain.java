package AlgorithmProblems.PalindromArray;

import java.util.Scanner;

public class PalindromArrayMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int[] arr=new int[scanner.nextInt()];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){  
            arr[i]=scanner.nextInt();
        }
        if(isPalindromeArray(arr))
            System.out.println("The array is a palindrome array");
        else
            System.out.println("The array is not a palindrome array");
        scanner.close();
    }

    public static boolean isPalindromeArray(int[] arr){
        boolean result=false;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=arr[arr.length-i-1])
                result=false;
            else
                result=true;
        }

        return result;
    }
}
