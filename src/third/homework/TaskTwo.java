package third.homework;

import java.util.Arrays;

//2.Вивести лише числа, які повторюються в масиві більше ніж 1 раз
public class TaskTwo {
    public static void main(String[] args) {
        int[] duplicate = {0, 222, 3, 4, 555, 62, 0, 4, 55};
        arraySort(duplicate);

        for (int i = 0; i < duplicate.length - 1; i++) {
            if (duplicate[i] == duplicate[i + 1]) {
                System.out.println(duplicate[i]);
            } else {
                continue;
            }
        }
    }
    static void arraySort(int[] x){
        Arrays.sort(x);
        Arrays.toString(x);
    }
}