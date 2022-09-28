package thirteen.homework;
//Користувач з консолі має водити слова доти доки не вид "break". Всі слова записується в List.
//Написати ф-цію для:
// виведення користувачу всіх слова які він ввів
// виведення слів які починаються на "s"
// виведення слів які мають кількість букв більше ніж 5

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TaskHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> myArrayList = new ArrayList<>();
        ArrayList<String> sArrayList = new ArrayList<>();
        ArrayList<String> arrayListFive = new ArrayList<>();

        String word;

        do {
            System.out.println("Enter the word: ");
            word = sc.next().toLowerCase(Locale.ROOT);
            myArrayList.add(word);
            if (word.equals("break")) {
                myArrayList.remove(word);
            }
            if (word.length() > 5) {
                arrayListFive.add(word);
            }
            if (word.startsWith("s")){
                sArrayList.add(word);
            }
        } while (!word.equals("break"));
        System.out.println("You entered: " + myArrayList);
        System.out.println("Words that start with \"s\": " + sArrayList);
        System.out.println("The word length is more than 5: " + arrayListFive);
    }
}
