package supersubpublic;

public class TrackPublic extends VehiclePublic {

    public int weight;

    public TrackPublic() {
    }

    public TrackPublic(int weight) {
        this.weight = weight;
    }

    public TrackPublic(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double SalePrice() {

        if (this.weight > 2000) {
            return super.regularPrice - super.regularPrice * 0.1;
        }
        return super.SalePrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
