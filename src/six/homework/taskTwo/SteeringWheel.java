package six.homework.taskTwo;

public class SteeringWheel {
    private double diameter;
    private String signal;

    public SteeringWheel(double diameter, String signal) {
        this.diameter = diameter;
        this.signal = signal;
    }

//замість конструктора вище можемо використати set, щоб задати параметри

//    public void setDiameter(double diameter) {
//        this.diameter = diameter;
//    }
//    public void setSignal(String signal) {
//        this.signal = signal;
//    }

    public double getDiameter() {
        return diameter *= 2;
    }

    public String getSignal() {
        return signal;
    }
}
