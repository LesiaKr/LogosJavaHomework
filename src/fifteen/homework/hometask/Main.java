package fifteen.homework.hometask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//HashSet
        Set<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("Oleg", 31));
        hashSet.add(new Person("Andriy", 29));
        hashSet.add(new Person("Olia", 19));
        hashSet.add(new Person("Mark", 32));
        hashSet.add(new Person("Yanna", 25));

        System.out.println("Невідсортований список (HashSet):");
        for (Person person: hashSet) {
            System.out.println(person);
        }

//LinkedHashSet
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("Oleg", 31));
        linkedHashSet.add(new Person("Andriy", 29));
        linkedHashSet.add(new Person("Olia", 19));
        linkedHashSet.add(new Person("Mark", 32));
        linkedHashSet.add(new Person("Yanna", 25));

        System.out.println("\nНевідсортований список в порядку добавлення елементів (LinkedHashSet):");
        for (Person person: linkedHashSet) {
            System.out.println(person);
        }

//TreeSet
        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("Oleg", 31));
        treeSet.add(new Person("Andriy", 29));
        treeSet.add(new Person("Olia", 19));
        treeSet.add(new Person("Mark", 32));
        treeSet.add(new Person("Yanna", 25));

        System.out.println("\nВідсортований список за ім'ям Comparable (TreeSet):");
        for (Person person: treeSet) {
            System.out.println(person);
        }

        Set<Person> treeSetComparator = new TreeSet<>(new PersonComparator());
        treeSetComparator.add(new Person("Oleg", 31));
        treeSetComparator.add(new Person("Andriy", 29));
        treeSetComparator.add(new Person("Olia", 19));
        treeSetComparator.add(new Person("Mark", 32));
        treeSetComparator.add(new Person("Yanna", 25));

        System.out.println("\nВідсортований список за віком Comparator (TreeSet):");
        for (Person person: treeSetComparator) {
            System.out.println(person);
        }
    }
}
