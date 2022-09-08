package six.homework.taskTwo;

public class SteeringWheel {
    private double diameter;
    private String signal;

    public SteeringWheel(double diameter, String signal) {
        this.diameter = diameter;
        this.signal = signal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }

    public void signal(){
        System.out.println("Bi-bi-p!");
    }
    public void duoDiameter(){
        double duoDiameter = diameter * 2;
        System.out.println(duoDiameter);
    }
}
