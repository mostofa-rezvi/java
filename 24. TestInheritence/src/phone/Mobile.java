package phone;

public class Mobile {

    private boolean makeCall;
    private String makeTestMessage;
    private String camera;
    private String multimedia;

    public Mobile() {
    }

    public Mobile(boolean makeCall, String makeTestMessage, String camera, String multimedia) {
        this.makeCall = makeCall;
        this.makeTestMessage = makeTestMessage;
        this.camera = camera;
        this.multimedia = multimedia;
    }

    public boolean isMakeCall() {
        return makeCall;
    }

    public void setMakeCall(boolean makeCall) {
        this.makeCall = makeCall;
    }

    public String getMakeTestMessage() {
        return makeTestMessage;
    }

    public void setMakeTestMessage(String makeTestMessage) {
        this.makeTestMessage = makeTestMessage;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Mobile{" + "makeCall=" + makeCall + ", makeTestMessage=" + makeTestMessage + ", camera=" + camera + ", multimedia=" + multimedia + '}';
    }
    
    public void printDetails(){
        System.out.println("Mobile Details is " + makeCall + makeTestMessage + camera + multimedia);
    }
}
