package core.twenty_three_stream_api.hometask;

import java.util.*;
import java.util.stream.Collectors;

/*Дана колекція клас People (з полями name - ім'я, age - вік, sex - стать)
Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років)
Знайти середній вік серед чоловіків
Знайти кількість потенційно працездатних людей у вибірці (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60)
Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
Знайти найстаршу людину
Знайти наймолодшу людину
Вивести скільки є чоловіків
Вивести скільки є жінок
Вивеcти всіх жінок в яких ім’я починається на “A” */
public class Main {
    public static void main(String[] args) {
        People people1 = new People("Anna", 17, "Female");
        People people2 = new People("Oleg", 16, "Male");
        People people3 = new People("Tanya", 56, "Female");
        People people4 = new People("Andriy", 18, "Male");
        People people5 = new People("Roman", 26, "Male");
        People people6 = new People("Mark", 61, "Male");
        People people7 = new People("Yulia", 45, "Female");

        List<People> peopleList = new ArrayList<>
                (Arrays.asList(people1, people2, people3, people4, people5, people6, people7));

//Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років)
        System.out.println("Чоловіки-військовозобов'язані: ");
        peopleList.stream()
                .filter(people -> people.getSex().equals("Male"))
                .filter(man -> man.getAge() >= 18 && man.getAge() <= 27).toList()
                .forEach(System.out::println);

//Знайти середній вік серед чоловіків
        System.out.println("\nСередній вік серед чоловіків: ");
        double manAverage = peopleList.stream()
                .filter((manAvg) -> manAvg.getSex().equals("Male"))
                .mapToInt((manAvg) -> manAvg.getAge())
                .average().getAsDouble();
        System.out.println(manAverage);

//Знайти кількість потенційно працездатних людей у вибірці (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60)
        System.out.println("\nКількість потенційно працездатних людей у вибірці: ");
        long countWorker = peopleList.stream()
                .filter(worker -> worker.getSex().equals("Male") && worker.getAge() >= 18 && worker.getAge() <= 60 ||
                        worker.getSex().equals("Female") && worker.getAge() >= 18 && worker.getAge() <= 55).count();
        System.out.println(countWorker);

//Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
        System.out.println("\nСортування за ім'ям в зворотному алфавітному порядку: ");
        List<People> sortedReverse = peopleList.stream()
                .sorted((a, b) -> b.getName().compareTo(a.getName()))
                .collect(Collectors.toList());
        System.out.println(sortedReverse);

//Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
        System.out.println("\nСортування спочатку за ім’ям: ");
        peopleList.stream()
                .sorted(Comparator.comparing(People::getName))
                .forEach(System.out::println);
        System.out.println("\n... а потім за віком: ");
        peopleList.stream()
                .sorted(Comparator.comparing(People::getAge))
                .forEach(System.out::println);

//Знайти найстаршу людину
        System.out.println("\nНайстарша людина: ");
        People oldest = peopleList.stream()
                .max(Comparator.comparingInt(People::getAge)).get();
        System.out.println(oldest);

//Знайти наймолодшу людину
        System.out.println("\nНаймолодша людина: ");
        People youngest = peopleList.stream()
                .min(Comparator.comparingInt(People::getAge)).get();
        System.out.println(youngest);

//Вивести скільки є чоловіків
        System.out.println("\nКількість чоловіків: ");
        long male = peopleList.stream()
                .filter(people -> people.getSex().equals("Male"))
                .count();
        System.out.println(male);

//Вивести скільки є жінок
        System.out.println("\nКількість жінок: ");
        long female = peopleList.stream()
                .filter(people -> people.getSex().equals("Female"))
                .count();
        System.out.println(female);

//Вивеcти всіх жінок в яких ім’я починається на “A”
        System.out.println("\nЖіноче ім’я, яке починається на “A”: ");
        peopleList.stream()
                .filter(name -> name.getSex().equals("Female") && name.getName().startsWith("A"))
                .forEach(System.out::println);
    }
}

