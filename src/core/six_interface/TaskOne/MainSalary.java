package core.six_interface.TaskOne;

//1. Створити interface Зарплата, в якому передбачити метод зарплата(). Створити клас Працівник з
// погодинною зарплатою, та Працівник з фіксованою місячною зарплатою.
//Реалізувати методи інтерфейсу в к класах :
//Працівник з погодинною зарплатою, та Працівник з фіксованою місячною зарплатою .
//Формула розрахунку зарплати працівника є довільною.
//Вивести на екран скільки заробляють перший і другий працівники.
public class MainSalary {
    public static void main(String[] args) {
        WorkerFixedSalary fixedSalary = new WorkerFixedSalary();
        WorkerHoursSalary hoursSalary = new WorkerHoursSalary();

        fixedSalary.Salary();
        hoursSalary.Salary();
    }
}
