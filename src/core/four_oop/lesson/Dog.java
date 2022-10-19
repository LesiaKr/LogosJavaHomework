package core.four_oop.lesson;

public class Dog extends Animals {
    public void bark(){
        System.out.println("The voice of a dog 'Woof'");
    }
    @Override
    public void voice(){
        this.bark();
    }
}
