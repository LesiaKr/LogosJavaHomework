package core.fifteen_map.zooClub;

import java.util.*;

public class ZooClub {

    private Map<Person, List<Animal>> mapZoo;
    Scanner scanner;

    public ZooClub() {
        mapZoo = new HashMap<>();
        scanner = new Scanner(System.in);
    }
    public void addPerson() {
        System.out.println("Enter the person's name: ");
        String name = scanner.next().toUpperCase(Locale.ROOT);
        System.out.println("Enter the person's age: ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (!mapZoo.containsKey(person)) {
            mapZoo.put(person, new ArrayList<Animal>());
            System.out.println("Added!  " + person + "\n");
        } else {
            System.out.println("Such a person is already in the club!");
        }
    }

    public void addAnimal() {
        System.out.println("Who will be the owner of the animal?");
        System.out.println("Enter the person's name: ");
        String name = scanner.next().toUpperCase();
        System.out.println("Enter the person's age: ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (mapZoo.containsKey(person)) {
            System.out.println("Enter the type of animal: ");
            String type = scanner.next().toUpperCase();
            System.out.println("Enter the name of the animal: ");
            String nameAnimal = scanner.next().toUpperCase();
            Animal animal = new Animal(type, nameAnimal);

            if (mapZoo.get(person).contains(animal)){
                System.out.println("Such an animal already exists.");
            } else {
                mapZoo.get(person).add(new Animal(type, nameAnimal));
                System.out.println("Animal " + nameAnimal + " has been added to " + person.getNamePerson());
            }

        } else {
            System.out.println("Such a person does not exist.");
        }
    }

    public void removeAnimal () {
        System.out.println("Enter the name of the pet's owner: ");
        String name = scanner.next().toUpperCase();
        System.out.println("Enter the age of the pet's owner: ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (mapZoo.containsKey(person)) {
            System.out.println("Enter the type of animal: ");
            String type = scanner.next().toUpperCase();
            System.out.println("Enter the name of the animal: ");
            String nameAnimal = scanner.next().toUpperCase();
            Animal animal = new Animal(type, nameAnimal);

            if (mapZoo.get(person).contains(animal)) {
                mapZoo.get(person).remove(mapZoo.get(person).indexOf(animal));
                System.out.println("The " + animal.getNameAnimal() + " was removed from the " + person.getNamePerson() + ".");
            } else {
                System.out.println("Such an animal does not exist.");
            }

        } else {
            System.out.println("Such a person does not exist.");
        }
    }

    public void removePerson(){
        System.out.println("Enter the person's name: ");
        String name = scanner.next().toUpperCase();
        System.out.println("Enter the person's age: ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        if (mapZoo.containsKey(person)) {
            mapZoo.remove(person);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Such a person does not exists.");
        }
    }

    public void showZooClub () {
        Set<Person> keySet = mapZoo.keySet();
        for (Person key : keySet) {
            for (Animal pet : mapZoo.get(key)) {
                System.out.println(key + " " + pet);
            }
            if (mapZoo.get(key).isEmpty()) {
                System.out.println(key);
            }
        }
        if (mapZoo.isEmpty()) {
            System.out.println("There is nobody in a zoo club!");
        }
    }
}

