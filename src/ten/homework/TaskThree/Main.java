package ten.homework.TaskThree;

import java.util.Scanner;

//3.Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б
//розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
//Якщо a<0 і b<0 викидаємо IllegalArgumentException
//Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
//Якщо a=0 і b=0 викидаємо IllegalAccessException
//Якщо a>0 і b>0 викидаємо MyException
//Протестувати всі можливі варіанти, і вивести все на консоль.
public class Main {
    public static void main(String[] args) throws MyException, IllegalArgumentException,
                                                               IllegalAccessException, ArithmeticException{
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second integer: ");
        double b = scanner.nextDouble();

        try {
            if (a < 0 && b < 0) {
                throw new IllegalArgumentException("Entered numbers are less than zero.");
            }
            if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
                throw new ArithmeticException("One of the numbers is zero.");
            }
            if (a == 0 && b == 0) {
                throw new IllegalAccessException("Both numbers are zero.");
            }
            if (a > 0 && b > 0) {
                throw new MyException();
            }else {
                System.out.println(methods.Divide(a, b));
                System.out.println(methods.Plus(a, b));
                System.out.println( methods.Minus(a, b));
                System.out.println( methods.Multiply(a, b));
            }
        }catch (MyException | IllegalArgumentException | IllegalAccessException | ArithmeticException  ex){
            System.err.println(ex.getMessage() + "\n" + ex.getClass());
        }
    }
}
