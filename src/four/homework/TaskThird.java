package four.homework;

//Створити двовимірний масив, який буде мати 5 рядків і 7 стовпців і заповнити його рандомними(Math.random())
// цифрами з проміжку [-2, 75]
public class TaskThird {
    public static void main(String[] args) {
        int[][] array = new int[5][7];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++)
                array[i][j] = (int) (Math.random() * 77) - 2;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++)
                System.out.print(array[i][j] + "   ");
            System.out.println();
        }
    }
}
