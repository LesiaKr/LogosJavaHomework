package core.four_oop.taskTwo;

public class CarBody {
    private String color;
    private String type;

    public CarBody(String color, String type) {
        this.color = color;
        this.type = type;
    }

    //замість конструктора вище можемо використати set, щоб задати параметри
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public void setType(String type) {
//        this.type = type;
//    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
