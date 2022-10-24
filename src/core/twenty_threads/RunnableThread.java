package core.twenty_threads;

import java.util.Scanner;

public class RunnableThread implements Runnable{
    static private Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("\nВведіть скільки чисел Фібоначі Ви хочете бачити?");
        try {
            fibonacciReverse(scanner.nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void  fibonacciReverse(int n) throws InterruptedException {
        int f1 = 0;
        int f2 = 1;
        int f3;

        Integer[] fibonacci = new Integer[n];
        fibonacci[0] = f1;
        fibonacci[1] = f2;

        System.out.print("Зворотній порядок: ");
        for (int i = 2; i < fibonacci.length; i++) {
            f3 = f1 + f2;
            fibonacci[i] = f3;
            f1 = f2;
            f2 = f3;
        }

        for (int i = fibonacci.length - 1; i >= 2; i--) {
            System.out.print(fibonacci[i] + " ");
            Thread.sleep(1000);
        }

        System.out.print(fibonacci[1] + " ");
        Thread.sleep(1000);
        System.out.print(fibonacci[0] + " ");
        Thread.sleep(1000);
    }
}

