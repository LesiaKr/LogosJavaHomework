package core.eleven_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email with @gmail.com: ");
        String sentence = scan.nextLine();

        Pattern pattern = Pattern.compile("@gmail.com$");
        Matcher matcher = pattern.matcher(sentence);

        if(matcher.find()){
            System.out.println("Welcome!");
        }else{
            System.out.println("Sorry, your email is not valid.");
        }
    }
}
