package five.homework.taskTwo;

public class Circle {
        public double diameter;
        public double radius;

        public Circle(double _diameter, double _radius){
                this.diameter = _diameter;
                this.radius = _radius;
        }
        public void circleArea () {
                System.out.println("Площа кола = " + (Math.PI * Math.pow(diameter,2)) / 4);
        }
        public void circleLength () {
                System.out.println("Довжина кола = " + (2 * Math.PI * radius));
        }
}
