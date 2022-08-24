package first.homework;

import java.util.Scanner;
// Площа круга та довжини колаffff
public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("The program solves: \n - Area of a circle: S = ПR^2 \n - Length of a circle: C = 2ПR");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius, values R: ");
        double R = scanner.nextDouble();
        double S = 3.14 * R * R;
        double C = 2 * 3.14 * R;
        System.out.println("Area of a circle S = " + S);
        System.out.println("Length of a circle C = " + C);
    }
}
