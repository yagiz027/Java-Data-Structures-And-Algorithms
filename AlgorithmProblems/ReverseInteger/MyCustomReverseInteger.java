package AlgorithmProblems.ReverseInteger;

import java.util.Scanner;

public class MyCustomReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a negative or positive numeric value:");
        int num = scanner.nextInt();
        System.out.println(getReverseInteger(num));
        scanner.close();    
    }

    private static int getReverseInteger(int num) {
        StringBuilder s = new StringBuilder();
        int finalNum = 0;

        while (num != 0){
            int lastDig = num % 10;
            finalNum += lastDig;
            finalNum = finalNum * 10 ;
            num = num /10;
        }

        finalNum = finalNum / 10;
        s.append(finalNum);

        if(s.length() >= 10){
            int max1 =  Integer.parseInt(s.substring(0,5));
            int max2 = Integer.parseInt(s.substring(5,10));
            if(max1 > 21474 || max2 > 83647){
                return 0;
            }
        }

        return (int) finalNum;
    }
}
