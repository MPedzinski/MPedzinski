package T1;

public class Rectangle implements Figure{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = (2*sideA)+(2*sideB);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area;
        area = sideA * sideB;
        return area;
    }

    @Override
    public String getType() {
        String Type = "Rectangle";
        return Type;
    }
}
