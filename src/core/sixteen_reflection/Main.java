package core.sixteen_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/*Створити довільний клас , описати його. Створити в мейн його екземпляр, дослідити всю інформацію про нього :
● отримати всі методи (private в тому числі);
● отримати поля класу (private в тому числі);
● отримати всі конструктори;
● створити екземпляр класу з двох різних конструкторів;
● викликати 2 методи (один - з параметрами, другий - без параметрів).*/
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //User user = new User();
        //Class<User> userClass = (Class<User>) user.getClass();
        Class<User> userClass = User.class;

        //отримати всі методи (private в тому числі);
        System.out.println("Отримати всі методи:");
        System.out.println("Всі публічні методи: " + Arrays.toString(userClass.getMethods()));
        System.out.println("\nВсі публічні i приватні методи: " + Arrays.toString(userClass.getDeclaredMethods()));

        //отримати поля класу (private в тому числі);
        System.out.println("\nОтримати поля класу:");
        System.out.println("Всі публічні поля: " + Arrays.toString(userClass.getFields()));
        System.out.println("\nВсі публічні i приватні поля: " + Arrays.toString(userClass.getDeclaredFields()));

        //отримати всі конструктори;
        System.out.println("\nОтримати всі конструктори:");
        System.out.println(Arrays.toString(userClass.getConstructors()));

        //створити екземпляр класу з двох різних конструкторів;
        System.out.println("\nСтворити екземпляр класу:");
        Constructor<User> constructor = userClass.getConstructor(int.class, String.class, int.class, String.class, double.class);
        User newInstance = constructor.newInstance(123456, "Oleg", 30, "oleg@gmail.com", 15);
        System.out.println(newInstance);

        //викликати 2 методи (один - з параметрами, другий - без параметрів)
        System.out.println("\nВикликати 2 методи:");
        System.out.println("Змінимо ім'я, використовуючи рефлексію:");
        Method userMethod = userClass.getMethod("setName", String.class);
        userMethod.invoke(newInstance, "Anna");
        System.out.println(newInstance);

        System.out.println("\nВиведемо ім'я, використовуючи рефлексію:");
        userMethod = userClass.getMethod("getName", null);
        System.out.println("Ім'я користувача - " + userMethod.invoke(newInstance, null));

        System.out.println("\nВведемо фінальну вартість, використовуючи рефлексію:");
        userMethod = userClass.getDeclaredMethod("getTotalPrice", double.class);
        System.out.println(userMethod.invoke(newInstance, 1000000));
    }
}
