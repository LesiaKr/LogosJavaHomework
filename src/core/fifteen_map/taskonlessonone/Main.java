package core.fifteen_map.taskonlessonone;

import java.util.*;
/*Описати структуру коли людині належить акаунт та зробити можливість
- додати акаунт до списку;
- видалити акаунт для певної людини;
- видалити людину;
- показати всю мапу людей та їх акаунти.
Вважаємо, що людина - унікальний ключ, за значення value беремо Account
Map<Person, Account>*/
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Oleg", 35);
        Person person2 = new Person("Andriy", 30);
        Person person3 = new Person("Olena", 40);

        Account account1 = new Account("account1", 852);
        Account account2 = new Account("account2", 543);
        Account account3 = new Account("account3", 256);
        Account account4 = new Account("account4", 112);

        List<Account> accountList = new ArrayList<>();
        Map<Person, List<Account>> mapUser = new HashMap<>();

        //додаємо через пустий list, додаючи почерзі
        mapUser.put(person1, accountList);
        mapUser.get(person1).add(account2);
        mapUser.get(person1).add(account3);
        //видаляємо акаунт людини
        mapUser.get(person1).remove(account2);
        //додаємо через форматування asList
        mapUser.put(person2, Arrays.asList(account1, account4));
        //додаємо новий об'єкт
        mapUser.put(person3, Arrays.asList(new Account("account4", 478)));
        //видалити людину
        mapUser.remove(person3);
        //виводимо
        System.out.println(mapUser);
    }
}
