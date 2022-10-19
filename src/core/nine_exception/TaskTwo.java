package core.nine_exception;

import java.util.Scanner;
/*Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених користувачем.
Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.*/
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first integer: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second integer: ");
            int b = scanner.nextInt();
            int c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        } catch (Exception  e) {
            System.err.println("The entered number is not an integer.");
        }
    }
}
