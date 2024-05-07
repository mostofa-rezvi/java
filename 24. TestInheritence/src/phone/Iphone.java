package phone;

public class Iphone extends Mobile{

    private String appStore;

    public Iphone() {
    }

    public Iphone(String appStore) {
        this.appStore = appStore;
    }

    public Iphone(String appStore, boolean makeCall, String makeTestMessage, String camera, String multimedia) {
        super(makeCall, makeTestMessage, camera, multimedia);
        this.appStore = appStore;
    }

    @Override
    public String toString() {
        return "Iphone{" + "appStore=" + appStore + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Has "+ appStore); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
