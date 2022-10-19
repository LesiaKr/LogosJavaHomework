package core.four_oop.taskTwo;
//Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString). Всі поля
//повинні бути приватними. Додати методи які б виконували певні функції з полями, тобто збільшували
//розмір колеса у декілька разів, чи змінювали діаметр керма і т.д.. Створити клас Машина, який
//матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу. Додати методи, які би
//змінювали стан полів класу , для виконання певних функцій, описати даний клас(getters, setters,
//toString). Всі поля повинні бути параметрами в конструкторі. В мейн методі , створити об`єкт
//Машина, запустити всі його методи.
public class MainCar {
    public static void main(String[] args) {
        //варіант задаємо значення через конструктор this, як параметри
        SteeringWheel steeringWheel = new SteeringWheel(11.5, "Bi-bi-p!!!");
        Wheel wheel = new Wheel(15, "Winter");
        CarBody carBody = new CarBody("Black", "Sedan");
        Car car = new Car(5000, 2.8, steeringWheel, wheel, carBody);

        //варіант задаємо значення через set
//        SteeringWheel steeringWheel = new SteeringWheel();
//        Wheel wheel = new Wheel();
//        CarBody carBody = new CarBody();
//        Car car = new Car();
//
//        steeringWheel.setDiameter(11.5);
//        steeringWheel.setSignal("Bi-bi-p!!!");
//        wheel.setTireSize(15);
//        wheel.setSeason("Winter");
//        carBody.setColor("Black");
//        carBody.setType("Sedan");
//        car.setPrice(5000);
//        car.setEnginePower(2.8);


        System.out.println(car);
    }
}
