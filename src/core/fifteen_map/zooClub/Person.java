package core.fifteen_map.zooClub;

import java.util.Objects;

public class Person {
    private String namePerson;
    private int age;

    public Person(String name, int age) {
        this.namePerson = name;
        this.age = age;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(namePerson, person.namePerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePerson, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + namePerson + '\'' +
                ", age=" + age +
                '}';
    }
}
