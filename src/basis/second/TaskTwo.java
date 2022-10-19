package basis.second;

import java.util.Scanner;
//Скласти розклад на тиждень
public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Введіть день тижня: ");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();
        switch (dayOfWeek){
            case "Понеділок":
                System.out.println("Зустріч з менеджером");
                break;
            case "Вівторок":
                System.out.println("Манікюр");
                break;
            case "Середа":
                System.out.println("Шопінг");
                break;
            case "Четвер":
                System.out.println("Зустріч з директором");
                break;
            case "П'ятниця":
                System.out.println("Скласти звіт");
                break;
            case "Субота":
                System.out.println("Масаж");
                break;
            case "Неділя":
                System.out.println("Святкування дня народження тата");
                break;
            default:
                System.out.println("Ви ввели не вірно! Спробуйте ще раз.");
        }
    }
}
