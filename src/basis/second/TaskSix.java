package basis.second;
//Найбільше та найменше значення масиву
public class TaskSix {
    public static void main(String[] args) {
        int[] arrayRandom = {1, 222, -3, 4, 555, 62, 44};
        int max_number = arrayRandom[0];
        int min_number = arrayRandom[0];
        for (int i = 0; i < arrayRandom.length; i++) {
            if (max_number < arrayRandom[i]) {
                max_number = arrayRandom[i];
            }
            if (min_number > arrayRandom[i]) {
                min_number = arrayRandom[i];
            }
        }
        System.out.println("Max number of array is: " + max_number);
        System.out.println("Min number of array is: " + min_number);
    }
}
