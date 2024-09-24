public class Circle {
    private double radius;   
    private double centerX;   
    private double centerY;   

    public Circle(double radius, double centerX, double centerY) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean isPointInside(double x, double y) {
        double distanceSquared = Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2);
        return distanceSquared <= radius * radius;
    }

    public int getIntersectionPoints(Circle other) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(other.centerX - this.centerX, 2) + Math.pow(other.centerY - this.centerY, 2));
        double radiusSum = this.radius + other.radius;
        double radiusDifference = Math.abs(this.radius - other.radius);

        if (distanceBetweenCenters > radiusSum) {
            // Кола не перетинаються
            return 0;
        } else if (distanceBetweenCenters < radiusDifference) {
            // Одне коло всередині іншого
            return 0;
        } else if (distanceBetweenCenters == 0 && this.radius == other.radius) {
            // Кола співпадають
            return -1; // Безкінечна кількість точок
        } else if (distanceBetweenCenters == radiusSum || distanceBetweenCenters == radiusDifference) {
            // Кола торкаються в одній точці
            return 1;
        } else {
            // Кола перетинаються в двох точках
            return 2;
        }
    }

    @Override
    public String toString() {
        return "Circle with center (" + centerX + ", " + centerY + ") and radius " + radius;
    }
}
