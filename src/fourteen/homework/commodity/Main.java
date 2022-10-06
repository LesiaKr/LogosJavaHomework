package fourteen.homework.commodity;

import java.util.Scanner;
//Реалізовуємо консольну програму. Створити клас Commodity. Описати даний клас: поля методи.
//Повинні бути такі методи:
//● Додати товар
//● Видалити товар
//● Замінити товар
//● Сортувати за назвоню
//● Сортувати за довжиною
//● Сортувати за шириною
//● Сортувати за вагою
//● Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
//● Вийти з програми(підказка System.exit)
//Для меню використати Switch.
public class Main {
    static void menu() {
        System.out.println("\nEnter 1 to add product.");
        System.out.println("Enter 2 to remove the product.");
        System.out.println("Enter 3 to replace the product.");
        System.out.println("Enter 4 to sort by name.");
        System.out.println("Enter 5 to sort by length.");
        System.out.println("Enter 6 to sort by width.");
        System.out.println("Enter 7 to sort by weight.");
        System.out.println("Enter 8 to show product.");
        System.out.println("Enter 9 to exit the program.\n");
    }
    public static void main(String[] args) {
        Storage storage = new Storage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();

            switch (scanner.next()) {
                case "1": {
                    storage.addCommodity();
                    break;
                }
                case "2": {
                    storage.removeCommodity();
                    break;
                }
                case "3": {
                    storage.replaceCommodity();
                    break;
                }
                case "4": {
                    storage.sortByName();
                    break;
                }
                case "5": {
                    storage.sortByLength();
                    break;
                }
                case "6": {
                    storage.sortByWidth();
                    break;
                }
                case "7": {
                    storage.sortByWeight();
                    break;
                }
                case "8": {
                    storage.getCommodity();
                    break;
                }
                case "9": {
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Enter a number from 1 to 9!");
                    break;
                }
            }
        }
    }
}
