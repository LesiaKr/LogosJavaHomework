package basis.second;

import java.util.Scanner;
// Розв'язки квадратного рівняння через функції
public class TaskOne {
    public static void main(String[] args) {
        System.out.println("The program solves a quadratic equation: ax^2 +bc + c = 0");
        double a = getNumber();
        double b = getNumber();
        double c = getNumber();
        double D = getDiscriminant(a, b, c);

        if (D == 0) {
            System.out.println("Quadratic equation has one solution: x = " + getIfZero(a, b));
        } else if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Equation roots: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("The equation has no real roots!");
        }
    }

    static double getNumber(){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    static double getDiscriminant(double a, double b, double c) {
        double D = (b * b) - (4 * a * c);
        return D;
    }
    static double getIfZero(double a, double b) {
        double x = -b / (2 * a);
        return x;
    }
}
