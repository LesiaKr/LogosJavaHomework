package core.nineteen_io.task_on_lesson;

import java.io.*;

public class MethodsPerson {

     void serializeP() throws IOException {
            FileOutputStream outputStream = new FileOutputStream("text.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            Person person = new Person("Iryna", "55");
            objectOutputStream.writeObject(person);

            objectOutputStream.flush();
            objectOutputStream.close();
        }

    void deserializeP() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("text.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person person = (Person) objectInputStream.readObject();
        System.out.println(person);
    }
}
