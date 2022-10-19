package core.eight_enum.Hometask;

import java.util.Scanner;

//Написати консольну програму для роботи з Enums.
//Створити енум Сезони, в якому оголосити такі константи : Зима , Весна, Літо, Осінь.
//Створити енум Місяці, в якому створити 12 констант- місяці року(Січень , Лютий.. Грудень ),
// оголосити змінну дні, та змінну сезон типу Сезон , як поле енума . Створити конструктор з визначеними
// параметрами в енумі Місяці, в який як параметри передати змінну дні та сезон. Описати getters до даних полів
// (дні, сезони). Створити консольне меню, в якому реалізувати наступні пункти :
//1.Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим ).
//2.Вивести всі місяці з такою ж порою року.
//3.Вивести всі місяці які мають таку саму кількість днів.
//4.Вивести на екран всі місяці які мають меншу кількість днів.
//5.Вивести на екран всі місяці які мають більшу кількість днів.
//6.Вивести на екран наступну пору року.
//7.Вивести на екран попередню пору року.
//8.Вивести на екран всі місяці які мають парну кількість днів.
//9.Вивести на екран всі місяці які мають непарну кількість днів.
//10.Вивести на екран чи введений з консолі місяць має парну кількість днів.
public class MainSeason {
    static void menu() {
        System.out.println("Enter 1 to check if there is such a month.");
        System.out.println("Enter 2 to display all months with the same time of year.");
        System.out.println("Enter 3 to display all months that have the same number of days.");
        System.out.println("Enter 4 to display all months that have fewer days.");
        System.out.println("Enter 5 to display all months that have the most days.");
        System.out.println("Enter 6 to display next season.");
        System.out.println("Enter 7 to display previous season.");
        System.out.println("Enter 8 to display all months that have an even number of days.");
        System.out.println("Enter 9 to display all months that have an odd number of days.");
        System.out.println("Enter 10 to display whether the month entered from the console has an even number of days.\n");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Months[] monthArr = Months.values();
        Seasons[] seasonArr = Seasons.values();
        while (true) {
            menu();
            switch (scanner.next()) {
                case "1": {  //Перевірити чи є такий місяць
                    boolean flag = false;
                    System.out.println("Enter the month");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();

                    for (Months m: monthArr) {

                        if (m.name().equals(month)) {
                            System.out.println("The month of " + m + " exists");
                            flag = true;
                        }
                    }

                    if (!flag) {
                        System.out.println("Such the month doesn't exist");
                    }
                    break;
                }
                case "2": {  //Вивести всі місяці з такою ж порою року.
                    boolean flag = false;
                    System.out.println("Enter the season");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();

                    for (Months m : monthArr) {
                        if (m.getSeason().name().equals(month)) {
                            System.out.println(m);
                            flag = true;
                        }
                    }

                    if (!flag) {
                        System.out.println("Such the season doesn't exist");
                    }
                    break;
                }
                case "3": {  //Вивести всі місяці які мають таку саму кількість днів.
                    boolean flag = false;
                    System.out.println("Enter the number of days in a month");
                    scanner = new Scanner(System.in);
                    Integer month = scanner.nextInt();

                    for (Months m : monthArr) {
                        if (m.getDays().equals(month)) {
                            System.out.println(m);
                            flag = true;
                        }
                    }

                    if (!flag) {
                        System.out.println("Such number  of days in a month does not exist");
                    }
                    break;
                }
                case "4": {  //Вивести на екран всі місяці які мають меншу кількість днів.
                    boolean flag = false;
                    System.out.println("Enter the number of days in a month");
                    scanner = new Scanner(System.in);
                    Integer month = scanner.nextInt();

                    for (Months m : monthArr) {
                        if (m.getDays() < month) {
                            System.out.println(m);
                            flag = true;
                        }
                    }

                    if (!flag) {
                        System.out.println("Such number  of days in a month does not exist");
                    }
                    break;
                }
                case "5": {  //Вивести на екран всі місяці які мають більшу кількість днів.
                    boolean flag = false;
                    System.out.println("Enter the number of days in a month");
                    scanner = new Scanner(System.in);
                    Integer month = scanner.nextInt();

                    for (Months m : monthArr) {
                        if (m.getDays() > month) {
                            System.out.println(m);
                            flag = true;
                        }
                    }

                    if (!flag) {
                        System.out.println("Such number  of days in a month does not exist");
                    }
                    break;
                }
                case "6": {  //Вивести на екран наступну пору року.
                    boolean flag = false;
                    System.out.println("Enter the season");
                    scanner = new Scanner(System.in);
                    String seasons = scanner.next().toUpperCase();

                    for (Seasons s : seasonArr) {

                        if (s.name().equals(seasons)) {
                            flag = true;
                        }

                        if (flag) {
                            Seasons seas = Seasons.valueOf(seasons);
                            int ordinal = seas.ordinal();

                            if (ordinal == seasonArr.length - 1) {
                                ordinal = 0;
                                System.out.println(seasonArr[ordinal] + " is next season.");
                            } else {
                                System.out.println(seasonArr[ordinal + 1] + " is next season.");
                            }
                            break;
                        }
                    }

                    if (!flag) {
                        System.out.println("Such the season doesn't exist");
                    }
                    break;
                }
                case "7": {  //Вивести на екран попередню пору року.
                    boolean flag = false;
                    System.out.println("Enter the season");
                    scanner = new Scanner(System.in);
                    String seasons = scanner.next().toUpperCase();

                    for (Seasons s : seasonArr) {

                        if (s.name().equals(seasons)) {
                            flag = true;
                        }

                        if (flag) {
                            Seasons se = Seasons.valueOf(seasons);
                            int ordinal = se.ordinal();

                            if (ordinal == 0) {
                                ordinal = seasonArr.length - 1;
                                System.out.println(seasonArr[ordinal] + " is previous season.");
                            } else {
                                System.out.println(seasonArr[ordinal - 1] + " is previous season.");
                            }
                            break;
                        }
                    }

                    if (!flag) {
                        System.out.println("Such the season doesn't exist");
                    }
                    break;
                }
                case "8": {  //Вивести на екран всі місяці які мають парну кількість днів.
                    for (Months m : monthArr) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println(m + " has " + m.getDays() + " days");
                        }
                    }
                    break;
                }
                case "9": {  //Вивести на екран всі місяці які мають непарну кількість днів.
                    for (Months m : monthArr) {
                        if (m.getDays() % 2 == 1) {
                            System.out.println(m + " has " + m.getDays() + " days");
                        }
                    }
                    break;
                }
                case "10": { //Вивести на екран чи введений з консолі місяць має парну кількість днів.
                    boolean flag = false;
                    System.out.println("Enter the month");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();

                    for (Months m : monthArr) {
                        if (m.name().equals(month)) {
                            flag = true;

                            if (m.getDays() % 2 == 0) {
                                System.out.println(m + " has even number of days");
                            }else {
                                System.out.println(m + " has odd number of days");
                            }
                        }
                    }

                    if (!flag) {
                        System.out.println("Such the month doesn't exist");
                    }
                    break;
                }
                default: {
                    System.out.println("Please select item from 1 to 10.");
                }
            }
        }
    }
}