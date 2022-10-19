package core.ten_string;
//а) Ініціалізувати стрічку : String str = "I like Java !!!".
//б) Роздрукувати останній символ рядка. Використовуємо метод
//в) Перевірити, чи закінчується ваша рядок підрядком "!!!".
//г) Перевірити, чи починається ваша рядок підрядком "I like".
//д) Перевірити, чи містить ваша рядок підрядок "Java".
//e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".
//ж) Замінити всі символи "а" на "о".
//з) Перетворіть рядок до верхнього регістру.
// і) Перетворіть рядок до нижнього регістру.
// к) Вирізати рядок Java c допомогою методу String.substring() .
public class TaskOnLesson {
    public static void main(String[] args) {
        String str = "I like Java !!!"; // a
        System.out.println(str.charAt(str.length()-1)); //б
        System.out.println(str.endsWith("!!!")); //в
        System.out.println(str.startsWith("I like")); //г
        System.out.println(str.contains("Java")); //д
        System.out.println(str.indexOf("Java")); //e
        System.out.println(str.replaceAll("a", "o")); //ж
        System.out.println(str.toUpperCase()); //з
        System.out.println(str.toLowerCase()); //і
        System.out.println(str.substring(7, 11)); //к
    }
}
