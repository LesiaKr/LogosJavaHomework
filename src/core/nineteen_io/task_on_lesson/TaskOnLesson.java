package core.nineteen_io.task_on_lesson;

import java.io.*;

/*З файлу зчитати вік та ім’я, які відділені пробілом, створити клас Person , який має два поля : ім’я та вік.
Записувати вік та ім’я з файлу в об’єкт типу Person. Створений об’єкт записати у файл( toString() ).*/
public class TaskOnLesson {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
        String data = "Anna 38";
        byte[] array = data.getBytes();
        for (byte b : array) {
            fileOutputStream.write(b);
        }
        fileOutputStream.flush();
        fileOutputStream.close();

        MethodsPerson methods_person = new MethodsPerson();
        methods_person.serializeP();
        methods_person.deserializeP();
    }
}
