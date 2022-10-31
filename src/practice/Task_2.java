package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*A number is a Special Number if it’s digits only consist 0, 1, 2, 3, 4 or 5
Given a number determine if it special number or not .*/
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        while (true) {
            String sentence = scanner.nextLine();

            Pattern pattern = Pattern.compile("[0-5]+");
            Matcher matcher = pattern.matcher(sentence);

            Pattern pattern2 = Pattern.compile("[6-9]+");
            Matcher matcher2 = pattern2.matcher(sentence);

            if (matcher.find() && !matcher2.find()) {
                System.out.println("Special!!");
            } else {
                System.out.println("Not!!");
            }
        }
    }
}
