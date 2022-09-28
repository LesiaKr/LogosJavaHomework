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
                    //isSorted = false;
                    sort = array[i];
                    array[i] = array[i+1];
                    array[i+1] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

//        int arr[] = { 64, 34, 25, -12, 22, 11, 90 , -3};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++)
//            for (int j = 0; j < n - i - 1; j++)
//                if (arr[j] > arr[j + 1]) {
//                    // swap arr[j+1] and arr[j]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//        System.out.println("Sorted array");
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }