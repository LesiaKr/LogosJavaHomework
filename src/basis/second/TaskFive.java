package basis.second;

import java.util.Scanner;
//Найближче до 10 з двох чисел
public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        double a = scanner.nextDouble();
        System.out.println("Введіть друге число: ");
        double b = scanner.nextDouble();
        double a1 = Math.abs(a - 10);
        double b1 = Math.abs(b - 10);
        if (a1 > b1) {
            System.out.println("Найближче до 10 число: " + b);
        } else {
            System.out.println("Найближче до 10 число: " + a);
        }
    }
}
