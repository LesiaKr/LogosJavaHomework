package third.homework;
//1.В масиві знаходяться числа від 1 до 100 включно.
//Ініціалізувати масив. Вивести лише числа які націло діляться на 14
public class TaskOne {
    public static void main(String[] args) {
        int [] hundred = new int[101];
        for(int i = 1; i < hundred.length; i++) {
            if (i % 14 == 0){
                hundred[i] = i;
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
