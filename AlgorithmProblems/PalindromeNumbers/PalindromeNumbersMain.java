package AlgorithmProblems.PalindromeNumbers;

import java.util.Scanner;

public class PalindromeNumbersMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int palindrom = scan.nextInt();
        int firstValue= palindrom;        
        int length = String.valueOf(palindrom).length();
         
        int rest,value=0;
        for (int i = 0; i<length; i++){
             
            rest = palindrom % 10;
            value = value * 10 + rest;
            palindrom = palindrom /10;
        }
         
        if(value == firstValue){
            System.out.println(value + " Palindrom Sayidir.");
        }else{
            System.out.println(value + " Palindrom Sayi Degildir.");
        }
    }
}
