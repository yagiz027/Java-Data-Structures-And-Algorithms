package Arrays.main.java.yagiz.SimpleOperations;

import java.util.Random;

public class ArrayOperations {

    public int[] getArray(int lengthOfArray){
        int[] array=new int[lengthOfArray];
        for(int i=0;i<array.length;i++){
            array[i]=new Random().nextInt(100);
        }
        return array;
    }

    public void getArrayElements(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public void getSumOfArray(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("\nSum of Array:\t"+sum);
    }

    public void getAvgOfArray(int[] array){
        double sum=0;
        double avg=0;
        for(int i=0;i<array.length;i++){
            sum=array[i];
        }
        avg=sum/array.length;
        System.out.println("Average of Array:\t"+avg); 
    }

    public void getMaxOfArray(int[] array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max value of Array:\t"+max);
    }

    public void getMinOfArray(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Min value of Array:\t"+min);
    }

    public void getSqrtOfArray(int[] array){
        int sqrt=0;
        for(int i=0;i<array.length;i++){
            sqrt=array[i]*array[i];
        }
        System.out.println("Square Root of Array:\t"+sqrt);
    }
}
