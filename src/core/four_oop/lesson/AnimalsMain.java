package core.four_oop.lesson;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();

        cat.voice();
        cat.voice();
        dog.bark();
        horse.igogo();
        horse.voice();
    }
}
