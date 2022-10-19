package core.second_wrappers;

import java.util.Arrays;
import java.util.Scanner;

//Користувач задає елементи масиву певного розміру (розмір масиву вибирає програміст).
//Ваше завдання вивести масив, який ввів користувач, а потім вивести масив у зворотньому порядку.
public class TaskSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 5 цілих чисел: ");
        int array[] = new int [5];

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Ви ввели: " + Arrays.toString(array));

        System.out.println("У зворотньому порядку: ");
        for (int i = array.length-1; i >= 0; i--){
           System.out.print(array[i] + " ");
        }
    }
}
