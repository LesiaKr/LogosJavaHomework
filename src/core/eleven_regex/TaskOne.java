package core.eleven_regex;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.
public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence in a few words: ");
        String sentence = scan.nextLine().toLowerCase(Locale.ROOT);

        String[] words = sentence.split(" ");
        for (String str : words) {

            Pattern pattern = Pattern.compile("^a[a-z]+");
            Matcher matcher = pattern.matcher(str);

            while(matcher.find()){
                System.out.println(str);
            }
        }
    }
}
