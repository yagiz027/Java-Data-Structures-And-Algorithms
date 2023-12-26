package AlgorithmProblems.RomanToInteger;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a roman value:");
        String numStr = scanner.nextLine();
        System.out.println("Numeric Value:" + romanToInteger(numStr));
        scanner.close();
    }

    private static int romanToInteger(String numStr) {
       int result = 0;
       for(int i = 0 ; i<=numStr.length()-1;i++){
        int s1 = valueofRomanChar(numStr.charAt(i));

        if (i + 1 < numStr.length()) {
            int s2 = valueofRomanChar(numStr.charAt(i + 1));

            if (s1 >= s2) {
                result += s1;
                } else {
                    result += s2 - s1;
                    i++;
                }
            } 
            else {
                result += s1;
            }
        }
        return result;
    }


    private static int valueofRomanChar(char romanChar){
        switch(romanChar){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
