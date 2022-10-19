package core.ten_string;

import java.util.Scanner;

//3)Ввести n слів з консолі. Вивести на екран слова які починаються на ‘a’ і мають парну кількість символів.
public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three or more words: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");

        for (String str : words) {
            if (str.startsWith("a") == true) {
                System.out.println(str);
            }
            if (str.length() % 2 == 0) {

                if(str.startsWith("a") == true){
                    continue;
                }
                System.out.println(str);
            }
        }
    }
}
