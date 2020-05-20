package T1;

public class Parallelogram implements Figure{

    private double baseSide;
    private double side;
    private double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = (2*baseSide)+(2*side);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area;
        area = baseSide*height;
        return area;
    }

    @Override
    public String getType() {
        String Type = "Parallelogram";
        return Type;
    }



}
