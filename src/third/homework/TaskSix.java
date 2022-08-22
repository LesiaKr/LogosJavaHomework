package third.homework;

import java.util.Arrays;

//6.Посортуйте масив від найменшого до найбільшого
public class TaskSix {
    public static void main(String[] args) {
        int[] array = {88, 1, 7, -19, 15, 3};
        boolean isSorted = false;
        int sort;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    sort = array[i];
                    array[i] = array[i+1];
                    array[i+1] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}