package supersubpublic;

public class VehiclePublic {

    public int speed;
    public double regularPrice;
    public String color;

    public VehiclePublic() {
    }

    public VehiclePublic(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    @Override
    public String toString() {
        return "VehiclePublic{" + "speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + '}';
    }

    public double SalePrice() {
        return regularPrice;
    }

}
