package AlgorithmProblems.ReversedAlgorithm;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text:");
        String str = scanner.nextLine();
        System.out.println(getReversed(str));

        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        System.out.println(getReversed(num));
        scanner.close();
    }

    public static String getReversed(String str){
        String newStr = "";
        for(int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            newStr = ch + newStr;
        }
        return newStr;
    }

    public static String getReversed(int num){
        StringBuilder newNum = new StringBuilder();
        char[] numbers = String.valueOf(num).toCharArray();
        for(int i = numbers.length - 1; i>=0; i--){
            newNum.append(numbers[i]);
        }
        return newNum.toString();
    }
}
