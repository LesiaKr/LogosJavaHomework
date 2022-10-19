package core.eleven_regex;
//Вхідним параметром є стрічка :
//String str = "I love Java more than my friend. Java is so beautiful.";
//перевірити чи є в стрічці слово “Java”;
//замінити слово “Java” на “C#”;
//замінити всі слова “Java” на “C#”;
public class TaskThree {
    public static void main(String[] args) {
        String str = "I love Java more than my friend. Java is so beautiful.";

        System.out.println(str.matches(".*Java.*"));
        System.out.println(str.replaceFirst("Java", "C#"));
        System.out.println(str.replaceAll("Java", "C#"));
    }
}
