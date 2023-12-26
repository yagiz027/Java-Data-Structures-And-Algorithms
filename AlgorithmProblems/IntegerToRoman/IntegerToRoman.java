package AlgorithmProblems.IntegerToRoman;

import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a numeric or roman value: ");
        int num = scanner.nextInt();
        System.out.println("Roman Value: " + integerToRoman(num));
        scanner.close();
    }
    public static String integerToRoman(int num) {
        String[] romaSimgeleri = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] romaDegerleri = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder romaIfadesi = new StringBuilder();

        int i = romaDegerleri.length - 1;

        while (num > 0) {
            if (num >= romaDegerleri[i]) {
                romaIfadesi.append(romaSimgeleri[i]);
                num -= romaDegerleri[i];
            } else {
                i--;
            }
        }

        return romaIfadesi.toString();
    }
}
