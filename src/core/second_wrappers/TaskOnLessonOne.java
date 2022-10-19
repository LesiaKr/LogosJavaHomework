package core.second_wrappers;

import java.util.Scanner;

//Запропонувати користувачу вводити числа доти, доки він не введе “0”. Після того, як користувач вводить “0”
// вивести на екран кількість чисел та суму чисел.
public class TaskOnLessonOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int amount = -1;

        do {
            System.out.println("Введіть число. \n(Для відміни введіть 0)");
            number = sc.nextInt();
            sum += number;
            amount ++;
        } while (number != 0);
        System.out.println("Ви ввели " + amount + " чисел. \nСума введених Вами чисел = " + sum);
    }
}
