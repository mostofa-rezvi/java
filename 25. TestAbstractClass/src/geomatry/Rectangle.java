package geomatry;

public class Rectangle extends GeomatryObject {

    private int widht;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * widht;
    }

    @Override
    public double getPerimeter() {
        return (height + widht) * 2;
    }

}
