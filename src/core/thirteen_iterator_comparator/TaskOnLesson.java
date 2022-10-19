package core.thirteen_iterator_comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//Створити ліст елементів типу int, ініціалізувати його (записати декілька
//елементів).
//● за допомогою ListIterator змінити значення елементів (наприклад всі
//помножити на 5, або до всіх додати 1);
//● вивести на екран всі значення з початку до кінця (за допомогою Iterator);
//● вивести на екран всі значення з кінця на початок (за допомогою
//ListIterator).
public class TaskOnLesson {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        ListIterator<Integer> listIterator = list.listIterator();

        //1
        System.out.print("New list: ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + 5 + " ");
        }

        //2
        System.out.print("\nAll number of list: ");
        for (Integer number: list) {
            System.out.print(number + " ");
        }

        //3
        System.out.print("\nAll number of list from end to start: ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
