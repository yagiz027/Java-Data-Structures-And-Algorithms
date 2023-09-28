package Arrays.main.java.yagiz.SimpleOperations.Manage;

import java.util.InputMismatchException;
import java.util.Scanner;

import Arrays.main.java.yagiz.SimpleOperations.ArrayOperations;
import Arrays.main.java.yagiz.SimpleOperations.FinalArrayOperations;
import Arrays.main.java.yagiz.SimpleOperations.MultiDimensionalArrayOperations;

public class ArrayOperationsManage {
    private ArrayOperations operations = new ArrayOperations();
    private MultiDimensionalArrayOperations mdArrayOperations = new MultiDimensionalArrayOperations();
    private FinalArrayOperations finalArrayOperations=new FinalArrayOperations();
    private Scanner scanner = new Scanner(System.in);

    public void runArrayOperations() {
        System.out.print("Please enter the length value of the array you want to operate on:\t");
        int length = scanner.nextInt();
        int[] array = operations.getArray(length);

        operations.getArrayElements(array);
        operations.getSumOfArray(array);
        operations.getAvgOfArray(array);
        operations.getMaxOfArray(array);
        operations.getMinOfArray(array);
        operations.getSqrtOfArray(array);
    }

    public void runMultiDimensionalArrayOperations() {
        System.out.println(
                "Please select the value of dimension your array:\n" +
                        "1. 2D Array" + "\n" +
                        "2. 3D Array" + "\n");
        String userChoose = scanner.nextLine();

        if (userChoose != "1" || userChoose != "0") {
            System.out.println(
                    "Please enter one of the options:\n" +
                            "1. 2D Array" + "\n" +
                            "2. 3D Array" + "\n");
            userChoose = scanner.nextLine();
        }

        switch (userChoose) {
            case "1":
                    try {
                        System.out.print("Please enter first dimension of array(x):");
                        int x = scanner.nextInt();
                        System.out.print("Please enter second dimension of array(y):");
                        int y = scanner.nextInt();
                        int[][] twoDarray = mdArrayOperations.getArray2D(x, y);
                        mdArrayOperations.getArrayElements(twoDarray);
                        mdArrayOperations.getAvgOfMultiDimensionalArray(twoDarray);
                        break;
                    } catch (InputMismatchException exception) {
                        System.out.println("Please enter a valid number");
                    }
                    break;
            case "2":
                    try {
                        System.out.print("Please enter first dimension of array(x):");
                        int x1 = scanner.nextInt();
                        System.out.print("Please enter second dimension of array(y):");
                        int y1 = scanner.nextInt();
                        System.out.print("Please enter thirth dimensions of array(z):");
                        int z = scanner.nextInt();
                        int[][][] threeDarray = mdArrayOperations.getArray3D(x1, y1, z);
                        mdArrayOperations.getArrayElements(threeDarray);
                        mdArrayOperations.getAvgOfMultiDimensionalArray(threeDarray);
                    } catch (InputMismatchException exception) {
                        System.out.println("Please enter a valid number");
                    }
                break;
            default:
                System.out.print("Please select one of these choices");
        }
    }

    public void runFinalArrayOpertaions(){
        try{
            System.out.print("Please enter the length of array:\t");
            scanner.nextInt();
            int[] array = finalArrayOperations.getFinalArray(10);
            finalArrayOperations.getFinalArrayElements(array);     
            finalArrayOperations.getFinalArraySum(array);       
            finalArrayOperations.getFinalArrayAvg(array);
            finalArrayOperations.getFinalArrayMax(array);
            finalArrayOperations.getFinalArrayMin(array);
        }catch(InputMismatchException exception){
            System.out.println("Please enter a valid number");
        }
    }
}
