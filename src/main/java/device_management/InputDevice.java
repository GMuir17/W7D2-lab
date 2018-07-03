package device_management;

public abstract class InputDevice {
    private String type;

    public InputDevice(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
