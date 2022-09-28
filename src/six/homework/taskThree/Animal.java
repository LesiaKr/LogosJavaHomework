package six.homework.taskThree;

public class Animal {
    private String name;
    private double speed;
    private int age;

    public Animal(String name, double speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

   public void getInfo(){
        System.out.println("Назва тварини = " + name + ", Швидкість тварини = " + speed + " км/год, Вік тварини  = " + age + " років");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
