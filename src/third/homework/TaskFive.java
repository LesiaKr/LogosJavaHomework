package third.homework;
//5.Є два довільні масиви. Створити та вивести третій масив, кожен елемент
// якого буде рівний різниці елементів першого та другого масивів.
//C = A - B , С - елемент третього масиву, А - елемент першого, В - елемент другого.
public class TaskFive {
    public static void main(String[] args) {
        int[] arrayA = {1, 222, -3, 4, 555, 62, 4};
        int[] arrayB = {5, 3, 5, -4, 55, 6, 20};
        int[] arrayC = new int [7];
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i] - arrayB[i];
        }
        for(int n : arrayC) {
            System.out.println(n);
        }
    }
}
