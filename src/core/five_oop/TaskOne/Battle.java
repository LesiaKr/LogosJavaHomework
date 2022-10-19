package core.five_oop.TaskOne;

//Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна. Зробити декілька типів воїнів-наслідників.
//Кожен з них має свої особливості , наприклад hp, зброя і т.д. Тут потрібно проявити свою фантазію і
// додавати класи, які хочеться.
//Потім має бути битва. Воїни можуть атакувати, якщо вони атакують, життя зменшується.
// На кожному етапі показувати інфу.
public class Battle {
    public static void main(String[] args) {

        Warrior warriorOne = new WarriorOne();
        Warrior warriorTwo = new WarriorTwo();
        Warrior warriorThree = new WarriorThree();

        Warrior[] warriors = new Warrior[]{warriorOne, warriorTwo, warriorThree};
        for (Warrior warrior : warriors) {
            warrior.showInfo();
        }

        System.out.println("\nБитва!!!");

        while (warriorOne.getHealth() >= 0 && warriorTwo.getHealth() >= 0 && warriorThree.getHealth() >= 0) {
            warriorOne.attack(warriorTwo);
            warriorTwo.attack(warriorThree);
            warriorThree.attack(warriorOne);
            warriorOne.attack(warriorThree);
            warriorTwo.attack(warriorOne);
            warriorTwo.attack(warriorOne);
            if (warriorOne.getHealth() <= 0 && warriorTwo.getHealth() <= 0) {
                System.out.println("\n ПЕРЕМІГ " + warriorThree.name);
            } else if (warriorTwo.getHealth() <= 0 && warriorThree.getHealth() <= 0) {
                System.out.println("\n ПЕРЕМІГ " + warriorOne.name);
            } else {
                System.out.println("\nПЕРЕМІГ " + warriorTwo.name);
            }
            break;
        }
    }
}
