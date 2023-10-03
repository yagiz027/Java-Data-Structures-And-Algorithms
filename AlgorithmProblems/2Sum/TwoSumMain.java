import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class TwoSumMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the target for the array: ");
        int nums[] = {2,7,11,15};
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums, target)));
        scanner.close();
    }

    //Time complexity => O(n^2)
    public static int[] twoSum(int[] nums, int target) {    
        int[] ret=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ret[0]=i;
                    ret[1]=j;
                }
            }
        }
        return ret;
    }


    //Time complexity => O(n)
    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0]=i;
                result[1]=i+1;
                break;
            }else{
                map.put(target-nums[i],i);
            }
        }

        return result;
    }
}
