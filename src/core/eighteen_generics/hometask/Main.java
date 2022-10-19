package core.eighteen_generics.hometask;

/*Створити клас MyEntry<K,V>. Описати в ньому дженеріками –поля, гетери/сетери, toString.
 Реалізувати в даному класі методи, які б:
● Додавали новий об’єкт в мапу
● Видаляли об’єкт мапи за ключем
● Видаляли об’єкт мапи за значенням
● Виводили на екран Set ключів
● Виводили на екран List значень
● Виводили на екран цілу мапу*/
public class Main {
    public static void main(String[] args) {
        MyEntry<String, Integer> myEntry = new MyEntry<>();

        myEntry.addSomeNew("John", 55);
        myEntry.addSomeNew("Jack", 25);
        myEntry.addSomeNew("Inna", 33);
        myEntry.addSomeNew("Anna", 55);
        myEntry.addSomeNew("Olia", 22);
        System.out.println("Added: " + myEntry);

        myEntry.removeSomeKey("John");
        System.out.println("\nAfter remove: " + myEntry);

        myEntry.removeSomeValue(55);
        System.out.println("\nAfter remove: " + myEntry);

        System.out.println("\nShow key: ");
        myEntry.showSetOfKey();

        System.out.println("\nShow value: ");
        myEntry.showListOfValue();

        System.out.println("\nShow all map: ");
        myEntry.showMap();
    }
}
