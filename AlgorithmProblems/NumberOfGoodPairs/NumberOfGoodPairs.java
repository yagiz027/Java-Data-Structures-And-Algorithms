package AlgorithmProblems.NumberOfGoodPairs;

import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("PLease enter the length of Array:");
        int n=scanner.nextInt();
        int[] arr=new int[n];

        System.out.print("Please enter the elements of Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        if(numIdenticalPairs(arr)>0){
            System.out.print("There are "+numIdenticalPairs(arr)+" pair in the array");
        }else
            System.out.print("There are no pair in the array");
        scanner.close();
    }
    public static int numIdenticalPairs(int[] nums) {
        int pairCount=0;
        for(int i=0;i<nums.length;i++){
            for(int j= i + 1; j < nums.length; j++){
                if(nums[i] - nums[j]==0){
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}
