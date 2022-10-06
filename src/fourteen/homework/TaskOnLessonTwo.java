package fourteen.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Завдання 1: Реалізувати сортування об’єктів типу User за параметром: userName, якщо userName однаковий,
//сортувати за userAge, якщо userAge однаковий сортувати за emailAddress. (Comparable)
// Завдання 2: Реалізувати сортування об’єктів типу User за
//довжиною емейла (використати Comparator)
public class TaskOnLessonTwo {
    public static void main(String[] args) {

        User user1 = new User("Ivan", 19, "zivan@gmail.com");
        User user2 = new User("Oleg", 22, "oleg22@gmail.com");
        User user3 = new User("Natalia", 35, "natalia@gmail.com");
        User user4 = new User("Olga", 40, "wwwolga@gmail.com");
        User user5 = new User("Oleg", 22, "oleg@gmail.com");

       // List<User> usersList = List.of(user1, user2, user3, user4, user5); //потрібен ArrayList для sort
        List<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);

        Collections.sort(usersList);
        System.out.println(usersList); //Comparable
        System.out.println("***************************");
        Collections.sort(usersList, new emailComparator());
        System.out.println(usersList); //Comparator
    }
}
class User implements Comparable<User> {
    private String userName;
    private Integer userAge;
    public String emailAddress;

    public User(String userName, Integer userAge, String emailAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.emailAddress = emailAddress;
    }

    @Override
    public int compareTo(User o) {
        int result = this.userName.compareTo(o.userName);
        if (result == 0){
            result = this.userAge.compareTo(o.userAge);
            if (result == 0){
                result = this.emailAddress.compareTo(o.emailAddress);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
//Завдання 2:
class emailComparator implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
        return o1.emailAddress.compareTo(o2.emailAddress);
    }
}

