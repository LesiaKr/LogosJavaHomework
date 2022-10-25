package core.twenty_threads;
/*Створити потік. Створити клас MyThread наслідувати його від класу Thread. Перевизначити метод run(),
так щоб можна було вивести введену з консолі кількість чисел Фібоначі. Тобто ми вводимо з консолі скільки
ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.
Створити потік. Створити клас RunnableThread імплементувати його від інтерфейсу Runnable. Метод run()
перевизначити таким чином, щоб числа Фібоначі виводились в зворотньому порядку. Тобто Спершу ввели через Scanner
скільки ми хочемо бачити чисел Фібоначі, потім з затримкою в 1секунду вивести їх від останнього до першого значення.*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();

        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();
        //runnableThread.run();
    }
}
