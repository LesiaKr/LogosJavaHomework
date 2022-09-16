package ten.homework.TaskLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    public String name;
    public int age;
    public String email;

    Scanner sc = new Scanner(System.in);

    public void showName() {
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println(name);
    }

    public void getAge() {
        System.out.println("Enter your age: ");
        try {
            age = sc.nextInt();
            if (age < 18) {
                throw new UnderAgeException();
            } else {
                System.out.println(age + " - Ok!!!");
            }
        } catch (InputMismatchException | UnderAgeException ex) {
            System.err.println(ex.getClass());
        }
    }

    public void getEmail(){
        System.out.println("Enter your e-mail: ");
        try {
            email = sc.nextLine();
            if (!email.contains("@")) {
                throw new IncorrectEmailException();
            } else {
                System.out.println("Ok!!!");
            }
        } catch (IncorrectEmailException exc) {
            System.err.println(exc.getClass());
        }
    }
}
class UnderAgeException extends Exception{}
class IncorrectEmailException extends Exception{}
