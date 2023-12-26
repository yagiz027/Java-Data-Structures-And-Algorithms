package AlgorithmProblems.ReverseInteger;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a negative or positive numeric value:");
        int num = scanner.nextInt();
        System.out.println(getReverseInteger(num));
        scanner.close();

    }

    private static int getReverseInteger(int x) {
        if(x >= 0){
           
            long rev = 0;

            while(x > 0){
                long rem = x%10;

                rev = rev*10 + rem;
                x /= 10;
            }

            if(rev > Integer.MAX_VALUE) return 0;

            return (int)rev;
        }else{
            x = x*(-1);
            long rev = 0;

            while(x > 0){
                long rem = x%10;

                rev = rev*10 + rem;
                x /= 10;
            }
            if((-1)*rev < Integer.MIN_VALUE) return 0;

            return (int)((-1)*rev);
        }
    }
}
