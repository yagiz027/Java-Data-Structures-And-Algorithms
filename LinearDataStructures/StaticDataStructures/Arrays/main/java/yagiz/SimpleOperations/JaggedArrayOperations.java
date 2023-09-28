package Arrays.main.java.yagiz.SimpleOperations;

import java.util.Scanner;

public class JaggedArrayOperations {
    private Scanner scanner=new Scanner(System.in);
    public void runJaggedArray(){
        System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = scanner.nextInt();
         
        int[][] jaggedArray = new int[numberOfArrays][];
         
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = scanner.nextInt();
            jaggedArray[i] = new int[sizeOfSubArray];
        }
         
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The jagged array is:");
        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
