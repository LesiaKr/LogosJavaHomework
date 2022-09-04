package five.homework.taskOne;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.5, 2.0);
        Rectangle rectangle2 = new Rectangle();

        System.out.println("Конструктор з параметрами: ");
        rectangle.area();
        rectangle.perimeter();

        System.out.println("*************************");
        System.out.println("Конструктор без параметрів:");
        rectangle2.area();
        rectangle2.perimeter();
    }
}
