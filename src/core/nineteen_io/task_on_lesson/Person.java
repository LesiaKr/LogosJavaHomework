package core.nineteen_io.task_on_lesson;

import java.io.Serializable;

public class Person implements Serializable {
     String name;
     String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", age = '" + age + '\'' +
                '}';
    }
}
