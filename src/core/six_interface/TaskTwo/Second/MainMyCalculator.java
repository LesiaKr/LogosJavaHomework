package core.six_interface.TaskTwo.Second;
//2. Створіть інтерфейс Plus з методoм  додати; Minus з методoм  відняти; Multiply з методoм помножити;
// Devide з методoм  поділити. Cтворіть інтерфейс Numerable, який наслідуватиметься від інтерфейсів Plus, Minus,
// Multiply, Devide в пакеті first. Створіть пакет second в якому створіть клас MyCalculator і заімплементіть
// даному класу інтерфейс Numerable та задайте реалізацію всім методам даного інтерфейсу. Створіть метод мейн
// та створіть об’єкт класу MyCalculator , до якого викличте всі його методи . Результати арифметичних операцій
// виведіть на консоль.
public class MainMyCalculator {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.Plus(10, 5.5));
        System.out.println(myCalculator.Minus(15, 2.5));
        System.out.println(myCalculator.Divide(15, 0));
        System.out.println(myCalculator.Multiply(5, 5));
    }
}
