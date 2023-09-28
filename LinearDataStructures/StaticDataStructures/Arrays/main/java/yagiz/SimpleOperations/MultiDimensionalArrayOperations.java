package Arrays.main.java.yagiz.SimpleOperations;

import java.util.Random;

public class MultiDimensionalArrayOperations {

    public void getSumOfMultiDimensionalArray(int[][] multiArray){
        int sum=0;
        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[i].length;j++){
                sum+=multiArray[i][j];
            }
        }
        System.out.println("Sum of multi dimensional array:"+sum);
    }

    public void getSumOfMultiDimensionalArray(int[][][] multiArray){
        int sum=0;
        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[i].length;j++){
                for(int k=0;k<multiArray[i][j].length;k++){
                    sum+=multiArray[i][j][k];
                }
            }
        }
        System.out.println("Sum of multi dimensional array:"+sum);
    }

    public void getAvgOfMultiDimensionalArray(int[][] multiArray){
        double sum=0, avg=0, count=0;
        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[i].length;j++){
                sum+=multiArray[i][j];
                count++;
            }
        }
        avg=sum/count;
        System.out.println("Average of multi dimensional array:"+avg);
    }
    
    public void getAvgOfMultiDimensionalArray(int[][][] multiArray){
        double sum=0,avg=0,count=0;
        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[i].length;j++){
                for(int k=0;k<multiArray[i][j].length;k++){
                    sum+=multiArray[i][j][k];
                    count++;
                }
            }
        }
        avg=sum/count;
        System.out.println("Average of multi dimensional array:"+avg);
    }

    public void getArrayElements(int[][] multiArray) {
        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[i].length;j++){
                System.out.print(multiArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void getArrayElements(int[][][] multiArray) {
        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[i].length;j++){
                for(int k=0;k<multiArray[i][j].length;k++){
                    System.out.print(multiArray[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }

    public int[][][] getArray3D(int x,int y, int z) {
        int[][][] multiArray=new int[x][y][z];
        Random rnd=new Random();
        for(int i=0;i<x;i++){
            for(int j=0;j<multiArray[i].length;j++){
                for(int k=0;k<multiArray[i][j].length;k++){
                    multiArray[i][j][k]=rnd.nextInt(100);
                }
            }
        }
        return multiArray;
    }

    public int[][] getArray2D(int x, int y) {
        int[][] multiArray=new int[x][y];
        Random random=new Random();
        for (int i=0;i< multiArray.length;i++) {
            for (int j=0;j<multiArray[i].length;j++) {
                multiArray[i][j]=random.nextInt(100);
            }            
        }
        return multiArray;
    }
}
