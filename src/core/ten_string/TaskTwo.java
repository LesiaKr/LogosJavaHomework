package core.ten_string;

import java.util.Scanner;

//2)Ввести n слів з консолі. Знайти найдовше і найкоротше слово та вказати яким воно було введено(порядковий номер).
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three or more words: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        String shortestWord = words[0];
        String longestWord = words[0];
        int count = 1;
        int count2 = 1;

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
                count = i+1;

            } else if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
                count2 = i+1;
            }
        }
        System.out.println("The shortest word is: " + shortestWord + ". Under the number: " + count );
        System.out.println("The longest word is: " + longestWord + ". Under the number: " + count2);
    }
}
