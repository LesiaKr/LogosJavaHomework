package core.twenty_threads;

import java.util.Scanner;

public class MyThread extends Thread{
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Введіть скільки чисел Фібоначі Ви хочете бачити?");
        try {
            fibonacci(scanner.nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void  fibonacci(int n) throws InterruptedException {
        int f1 = 0;
        int f2 = 1;
        int f3;
        System.out.print("Звичайний порядок: ");
        System.out.print(f1 + " ");
        Thread.sleep(1000);
        System.out.print(f2 + " ");
        Thread.sleep(1000);

        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
            Thread.sleep(1000);
        }
    }
}
