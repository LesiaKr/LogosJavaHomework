package core.twelve_collection_list;

import java.util.Arrays;
import java.util.Objects;

public class TaskOnLesson {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];

        fillNumber(arr);
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        sortByGrowth(arr);
        System.out.println("Sorting by growth: " + Arrays.toString(arr));
        sortByDescendingOrder(arr);
        System.out.println("By descending order: " + Arrays.toString(arr));
    }

    public static void fillNumber(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
    }
    public static void sortByGrowth(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }
    public static void sortByDescendingOrder(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }
}
