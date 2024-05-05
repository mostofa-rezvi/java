package geomatry;

public class Circle {

    double radious;

    public Circle() {
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getArea() {
        return Math.pow(radious, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radious * Math.PI;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
}
