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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void price(){
            price = price * 0.15;
        System.out.println(price);
    }
    public void enginePower(){
        enginePower = enginePower + 0.02;
        System.out.println(enginePower);
    }
}
