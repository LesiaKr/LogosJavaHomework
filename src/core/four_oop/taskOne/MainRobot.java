package core.four_oop.taskOne;
//1) Створити клас Robot i класи CoffeRobot, RobotDancer, RobotCoocker, які будуть нащадками Robot. Оголосити в Robot метод work(),
// в якому слід описати роботу яку буде виконувати кожен з роботів (тобто, метод повинен пронаслідуватись):
//• Для Robot, щоб на консоль виводився текст «Я Robot – я просто працюю».
//• Для CoffeRobot, щоб на консоль виводився текст «Я CoffeRobot – я варю каву».
//• Для RobotDancer, щоб на консоль виводився текст «Я RobotDancer – я просто танцюю».
//• Для RobotCoocker, щоб на консоль виводився текст «Я RobotCoocker – я просто готую».
//Створити в Main класі екземпляри вищеописаних класів і викликати до кожного з них метод work().
//Створити в Main класі масив класу Robot , заповнити масив екземплярами вищеописаних класів. Створити цикл for ,
// пройтись по всіх елементах масиву і викликати для кожного елемент масиву метод work().
public class MainRobot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot coffeRobot = new CoffeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCoocker = new RobotCoocker();
        //варіант перший
        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCoocker.work();

        System.out.println("***********************");
        //варіант другий
        Robot robots[] = new Robot[] {robot, coffeRobot, robotDancer, robotCoocker};
        for (Robot robotAll: robots){
            robotAll.work();
        }
    }
}

