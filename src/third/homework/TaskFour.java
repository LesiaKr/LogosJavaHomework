package third.homework;
//4.Вивести індекси найбільшого, найменшого елеманта з масиву
public class TaskFour {
    public static void main(String[] args) {
        int[] arrayRandom = {1, 222, -3, 4, 555, 62, 44};
        int max_index = arrayRandom[0];
        int min_index = arrayRandom[0];
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[max_index] < arrayRandom[i]) {
                max_index = i;
            }
            if (arrayRandom[min_index] > arrayRandom[i]) {
                min_index = i;
            }
        }
        System.out.println("Max index of array is: " + max_index);
        System.out.println("Min index of array is: " + min_index);
    }
}
