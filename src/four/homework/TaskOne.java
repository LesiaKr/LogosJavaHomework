package four.homework;

import java.util.Scanner;

//В банк поклали m - гривень під n-% відсотків річних. Яким буде вклад за K-років.
//Користувач вводить : m -суму грошей , n - процентна ставка та  k-кількість років.
public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму грошей: ");
        double m = scanner.nextDouble();
        System.out.println("Введіть процентну ставку: ");
        double n = scanner.nextDouble();
        System.out.println("Введіть кількість років: ");
        double k = scanner.nextDouble();
        double x = m * (1 + n / 100 * k);
        System.out.println("Ваш вклад становитиме: " + x);
    }
}
