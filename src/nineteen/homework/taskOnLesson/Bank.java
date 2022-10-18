package nineteen.homework.taskOnLesson;

/*Написати структуру Банк :
Створити клас Account, від нього унаслідувати різні типи акаунтів :
DebitAccount(в нього поле Id є стрінговим), CreditAccount (в нього поле Id є числовим).
Створити клас User. Створити параметризований інтерфейс - User service, який буде в якості
параметра приймати Account(та наслідників) та User і буде мати наступні методи :
- показати всіх користувачів(посортованих по user name)
- показати всі рахунки
- повернути кількість податку для людини, яка розраховується як загальну суму на рахунку * 0,05*/
public class Bank{
    public static void main(String[] args) {

        UserServiceImpl<Account, User> userService = new UserServiceImpl();

        User user1 = new User("John");
        userService.addAccount(user1, new DebitAccount("first", 5000));
        userService.addAccount(user1, new CreditAccount(1, 4000));

        User user2 = new User("Alex");
        userService.addAccount(user2, new DebitAccount("second", 3000));
        userService.addAccount(user2, new CreditAccount(2, 2000));

        User user3 = new User("Anna");
        userService.addAccount(user3, new DebitAccount("third", 6000));
        userService.addAccount(user3, new CreditAccount(3, 3000));

        userService.printAllUsers();
        userService.printAllAccount();

        System.out.println("\nThe amount of tax for: " + user1.getUsername() + " "
                + userService.countTax(user1.getAccountList().get(1)));
        System.out.println("The amount of tax for: " + user2.getUsername() + " "
                + userService.countTax(user2.getAccountList().get(0)));
        System.out.println("The amount of tax for: " + user3.getUsername() + " "
                + userService.countTax(user3.getAccountList().get(1)));
    }
}
