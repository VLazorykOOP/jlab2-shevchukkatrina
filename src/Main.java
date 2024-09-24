public class Main {
    public static void main(String[] args) {
        System.out.println("--- Working with Rational Fractions ---");
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(5, 6);
        System.out.println("Rational r1: " + r1);
        System.out.println("Rational r2: " + r2);
        System.out.println("r1 + r2: " + r1.add(r2));
        System.out.println("r1 - r2: " + r1.subtract(r2));
        System.out.println("r1 * r2: " + r1.multiply(r2));
        System.out.println("r1 / r2: " + r1.divide(r2));

        System.out.println("\n--- Working with circles ---");
        Circle circle1 = new Circle(5, 0, 0);
        Circle circle2 = new Circle(3, 6, 0);
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circumference of Circle 1: " + circle1.getCircumference());
        System.out.println("Area of Circle 1: " + circle1.getArea());
        System.out.println("Intersection points: " + circle1.getIntersectionPoints(circle2));

        System.out.println("\n--- Fast array sorting ---");
        QuickSortExample.sortRandomArray();
    }
}
