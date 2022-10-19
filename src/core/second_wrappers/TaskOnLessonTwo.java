package core.second_wrappers;

import java.util.Scanner;

//Вивести суму всіх цілих чисел з проміжку, який введе користувач [a, b].
public class TaskOnLessonTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers in the range " + a + " and " + b + " = " + sum);
    }
}
