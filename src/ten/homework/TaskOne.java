package ten.homework;

import java.util.Scanner;

/*Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним.
 Якщо користувач введе не ціле число, то повідомляти йому про помилку.*/
public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } catch (Exception  e) {
            System.err.println("The entered number is not an integer.");
        }
    }
}
