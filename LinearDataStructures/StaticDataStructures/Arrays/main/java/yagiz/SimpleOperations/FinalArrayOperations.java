package Arrays.main.java.yagiz.SimpleOperations;

import java.util.Random;

public class FinalArrayOperations {
    public int[] getFinalArray(int lengthOfArray) {
        final int[] array = new int[lengthOfArray];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        return array;
    }

    public void getFinalArrayElements(final int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void getFinalArrayMax(final int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum of final array:\t"+max);
    }

    public void getFinalArrayMin(final int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum of final array:\t"+min);
    }

    public void getFinalArraySum(final int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of final Array:\t"+sum);
    }

    public void getFinalArrayAvg(final int[] array){
        double avg=0, sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        avg=sum/array.length;
        System.out.println("Average of final Array:\t"+avg);
    }
}
