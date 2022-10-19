package core.third_oop.taskOne;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double _length, double _width){
        this.length = _length;
        this.width = _width;
    }
    public Rectangle(){
        length = 4;
        width = 6;
    }
    public void area(){
        System.out.println("Площа прямокутника = " + (length * width));
    }
    public void perimeter(){
        System.out.println("Периметр прямокутника = " + (length + width) * 2);
    }
}
