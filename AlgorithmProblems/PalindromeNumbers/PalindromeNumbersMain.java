package AlgorithmProblems.PalindromeNumbers;

import java.util.Scanner;

public class PalindromeNumbersMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number=scanner.nextInt();
        if(isPalindrome(number)){
            System.out.println("The number "+number+" is palindrome." );
        }else
            System.out.println("The number "+number+" is not palindrome." );
        scanner.close();
    }
    public static int getReversedNumber(int firstValue) {
        int reversedNumber=0;
        while(firstValue>0){
            reversedNumber = (reversedNumber * 10) + (firstValue % 10);
            firstValue = firstValue / 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(int number){
        boolean result=false;
        if(number==getReversedNumber(number)){
            result=true;
        }
        return result;
    }
}
