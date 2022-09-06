package five.homework.taskTwo;
//Створити клас Коло. Описати його двома полями: радіус , діаметр. Введений може бути дробовим.
// Написати два методи які будуть виводити на екран площу кола і довжину кола.
// Для площі використати параметр - діаметр. Для довжини кола використати радіус.
public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(11, 5.5);

        circle.circleArea();
        circle.circleLength();
    }
}
