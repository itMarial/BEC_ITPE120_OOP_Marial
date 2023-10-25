public class shapesCal4 {
    public static void main(String[] args) {
       

        Shape[] shapess = {Shape.CIRCLE, Shape.SQUARE, Shape.TRIANGLE};
        for (Shape shape : shapess) {

          System.out.println();
        System.out.println("Shape: " + shape);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
    }

    enum Shape {
        CIRCLE(3.0),                 // Circle with a radius of 3 units
        SQUARE(4.0),                 // Square with a side length of 4 units
        TRIANGLE(3.0, 4.0, 5.0);     // Triangle with sides of lengths 3, 4, and 5 units

        private double[] sides;

        Shape(double side) {
            sides = new double[] { side };
        }

 
        Shape(double side1, double side2, double side3) {
            sides = new double[] { side1, side2, side3 };
        }

        public double calculateArea() {
            if (this == SQUARE) {
                double side = sides[0];
                return side * side;
            }
            return 0.0;
        }

        public double calculatePerimeter() {
            double perimeter = 0.0;
            for (double side : sides) {
                perimeter += side;
            }
            return perimeter;
        }
    }
}
