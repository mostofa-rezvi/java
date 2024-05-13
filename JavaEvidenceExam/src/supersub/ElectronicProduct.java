package supersub;

public class ElectronicProduct extends Product{

    private int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProduct(int warrantyPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" + "warrantyPeriod=" + warrantyPeriod + '}';
    }

    @Override
    public double getSalePrice() {
        double warrantyYear = warrantyPeriod / 12.0;
        
        if (warrantyYear > 1.25) {
            return super.getRegularPrice() - super.getRegularPrice()*0.15;
        }
   
//        if (this.warrantyPeriod > 1) {
//            return super.getRegularPrice() - super.getRegularPrice()*0.15;
//        }
        
        return super.getSalePrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
