package core.twenty_one;

import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
/*1.Створити власну анотацію, яка буде приймати хоча б один параметр. Створити
клас із певними полями і над декількома полями написати власну анотацію.
Створити метод який буде записувати поля класу які промарковані анотацією в
файл(рефлексія).*/
public class Main {
    public static void main(String[] args) {
        User user = new User();
        try {
            writeToFile(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(User u) throws IOException {
        Class cla = u.getClass();
        Field[] declaredFields = cla.getDeclaredFields();
        BufferedWriter bufWriter = Files.newBufferedWriter(Path.of("writeToFile"));

        for (Field f : declaredFields) {
            if (f.isAnnotationPresent(UserAnnotation.class)) {
                bufWriter.append(f.getName() + " with annotation: " + f.getAnnotation(UserAnnotation.class).value() + "\n");
            }
        }
        bufWriter.close();
    }
}

