package first.homework;

import java.util.Scanner;
// Розв'язки квадратного рівняння
public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("The program solves a quadratic equation: ax^2 +bc + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        double D = (b * b) - (4 * a * c);
        if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Quadratic equation has one solution: x = " + x);
        } else if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Equation roots: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}
