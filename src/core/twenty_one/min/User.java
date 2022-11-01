package core.twenty_one.min;
/*1.Створити власну анотацію, яка буде приймати хоча б один параметр. Створити
клас із певними полями і над декількома полями написати власну анотацію.
Створити метод який буде записувати поля класу які промарковані анотацією в
файл(рефлексія).*/
public class User {
    @UserAnnotation("something for username")
    private String username;
    @UserAnnotation("some id")
    private int id;
    @UserAnnotation("enter full age, without months")
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username = '" + username + '\'' +
                ", id = " + id +
                ", age = " + age +
                '}';
    }
}
