package sixteen.homework.zooClub;

import java.util.Scanner;

/*Створити структуру Зооклуб.
Створити клас Person , який описати двома полями : ім’я , вік.
Створити клас Animal , який описати двома полями : тип тваринки(кіт,пес), ім’я тваринки.
Кожна людина може мати багато тваринок. Але одна тваринка належить лише одній людині.
Map<Person, List<Animal>> map;
Реалізувати консольне меню(НЕ обов’язково), таким чином щоб можна було:
● Додати людину до клубу 1
● Додати тваринку до людини 2
● Видалити(забрати) тваринку від людини 3
● Видалити людину з клубу 4
● Вивести на екран зооклуб 5
● Вийти з програми 6
Використати для побудови меню Switch.*/
public class Main {
    static void menu() {
        System.out.println("\nEnter 1 to add a person to the club.");
        System.out.println("Enter 2 to add a pet to a person.");
        System.out.println("Enter 3 to remove (take away) the pet from the person.");
        System.out.println("Enter 4 to remove the person from the club.");
        System.out.println("Enter 5 to bring up the zoo club.");
        System.out.println("Enter 6 to exit the program.\n");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooClub zooClub = new ZooClub();
        while (true) {
            menu();

            switch (scanner.next()) {
                case "1": {
                    zooClub.addPerson();
                    break;
                }
                case "2": {
                    zooClub.addAnimal();
                    break;
                }
                case "3": {
                    zooClub.removeAnimal();
                    break;
                }
                case "4": {
                    zooClub.removePerson();
                    break;
                }
                case "5": {
                    zooClub.showZooClub();
                    break;
                }
                case "6": {
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Enter a number from 1 to 6!");
                    break;
                }
            }
        }
    }
}
