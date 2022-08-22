package third.homework;

public class TestTaskOnLesson {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть два числа сума яких більше ста: ");
//        int number_one;
//        int number_two;
//        do {
//            System.out.println("Введіть число: ");
//            number_one = scanner.nextInt();
//            number_two = scanner.nextInt();
//        } while ((number_one+number_two) < 100);{
//            System.out.println("Вітаю. Все вірно.");
//        }

        //задачка 2
//        int[] arrayRandom = {1, 222, -3, 4, 555, 62, 44};
//        for (int number: arrayRandom) {
//            System.out.println(number++);

        //задачка 3
        // В масив розміром 50 комірок, помістити лише не парні цифри
        int array [] = new int [50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
