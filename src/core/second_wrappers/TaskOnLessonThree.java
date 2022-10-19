package core.second_wrappers;

import java.util.Scanner;

//Користувач вводить 10 чисел , в кінці програма рахує скільки додатних,
// від’ємних та нулів введено і виводить на екран
public class TaskOnLessonThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 10 чисел.");
        int number;
        int amount = 0;
        int amountZero = 0;
        int amountPositive = 0;
        int amountNegative = 0;
        do {
            number = sc.nextInt();
            amount ++;
            if(number == 0){
                amountZero++;
            } else if(number > 0){
                amountPositive++;
            } else {
                amountNegative++;
            }
        } while (amount != 10);
        System.out.println("Ви ввели " + amount + " чисел. " +
                "\nКількість введених нулів: " + amountZero +
                "\nКількість додатніх чисел: " + amountPositive +
                "\nКількість від'ємних чисел: " + amountNegative);
    }
}
