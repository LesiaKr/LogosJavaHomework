package six.homework.taskTwo;

public class Car {
    private double price;
    private double enginePower;
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private CarBody carBody;

    public Car(double price, double enginePower, SteeringWheel steeringWheel, Wheel wheel, CarBody carBody) {
        this.price = price;
        this.enginePower = enginePower;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.carBody = carBody;
    }

    //замість конструктора вище можемо використати set, щоб задати параметри
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    public void setEnginePower(double enginePower) {
//        this.enginePower = enginePower;
//    }

    public double getPrice() {
        return price *= 0.80;
    }

    public double getEnginePower() {
        return enginePower += 0.02;
    }

    public double getDiameter() {
        return steeringWheel.getDiameter();
    }

    public String getSignal() {
        return steeringWheel.getSignal();
    }

    public int getTireSize() {
        return wheel.getTireSize();
    }

    public String getSeason() {
        return wheel.getSeason();
    }

    public String getColor() {
        return carBody.getColor();
    }

    public String getType() {
        return carBody.getType();
    }

    @Override
    public String toString() {
        return "Car{" +
                "diameter = " + getDiameter() +
                ", signal = " + getSignal() +
                ", tire size = " + getTireSize() +
                ", season = " + getSeason() +
                ", color = " + getColor() +
                ", type = " + getType() +
                ", price = " + getPrice() +
                ", engine power = " + getEnginePower() +
                '}';
    }
}
