package Circle;
// package trong package

public class Circle {
        private static final double PI = 3.14;
        private static int count = 0;
        private static double maxRadius = 0;
        private static double totalArea = 0;
        private int id;
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
            this.id = ++count;
            totalArea += calculateArea();
            if (radius > maxRadius) {
                maxRadius = radius;
            }
        }

        public Circle() {
            this(0);
        }

        public double calculateArea() {
            return PI * radius * radius;
        }

        public double calculateCircumference() {
            return 2 * PI * radius;
        }

        public static int getCount() {
            return count;
        }

        public static double getMaxRadius() {
            return maxRadius;
        }

        public static double getTotalArea() {
            return totalArea;
        }

        @Override
        public String toString() {
            return "Circle{id=" + id + ", radius=" + radius + "}";
        }
    }



