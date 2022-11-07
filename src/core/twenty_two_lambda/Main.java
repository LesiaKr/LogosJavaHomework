package core.twenty_two_lambda;
/*Створіть функціональний інтерфейс із методом, який приймає три значення int та повертає значення int.
Створіть лямбда-функції (як змінні в основному методі), що реалізує цей інтерфейс:
Перша лямбда повертає максимальне значення
Друга - середнє значення
Третя - суму всіх трьох значень
Викликати ці лямбди.*/
public class Main{
    public static void main(String[] args) {
        MyFunctional getMax = (a, b, c) -> {
            int max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            return max;
        };

        MyFunctional getAvg = (a, b, c) -> (a + b + c) / 3;
        MyFunctional getSum = (a, b, c) -> (a + b + c);

        System.out.println("Max number: " + getMax.getNumber(19, 55, -97));
        System.out.println("Average number: " + getAvg.getNumber(4, 6, 2));
        System.out.println("Sum of numbers: " + getSum.getNumber(88, 1, 0));
    }
}
