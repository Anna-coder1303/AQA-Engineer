interface Figura {
    String fillColor = "Зеленый";
    String borderColor = "Черный";
    double Perimetr();
    double Area();
}
class Circle implements Figura {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Круг: " + "Периметр = " + Perimetr() + ", " + "Площадь = " + Area() + ", " +
                "Цвет фона = " + fillColor + ", " + "Цвет границы = " + borderColor;
    }
}

class Rectangle implements Figura {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override

    public double Perimetr() {
        return 2 * (width + height);
    }

    @Override
    public double Area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник: " + "Периметр = " + Perimetr() + ", " + "Площадь = " + Area() + ", " +
                "Цвет фона = " + fillColor + ", " + "Цвет границы = " + borderColor;
    }
}
class Triangle implements Figura {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double Perimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double Area() {
        double poluperimetr = Perimetr() / 2.0;
        return Math.sqrt(poluperimetr * (poluperimetr - side1) * (poluperimetr - side2) * (poluperimetr - side3));
    }

    @Override
    public String toString() {
        return "Треугольник: " + "Периметр = " + Perimetr() + ", " + "Площадь = " + Area() + ", " +
                "Цвет фона = " + fillColor + ", " + "Цвет границы = " + borderColor;
    }
}

public class FigureL11 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(7, 5, 11);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }

}
