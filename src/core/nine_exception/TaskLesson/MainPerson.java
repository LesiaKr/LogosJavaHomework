package core.nine_exception.TaskLesson;

import java.util.InputMismatchException;

public class MainPerson {
    public static void main(String[] args) throws UnderAgeException, IncorrectEmailException, InputMismatchException {
        Person person = new Person();
        person.showName();
        person.getEmail();
        person.getAge();
    }
}
