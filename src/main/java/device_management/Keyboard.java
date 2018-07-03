package device_management;

public class Keyboard extends InputDevice {

    private String manufacturer;

    public Keyboard(String type, String manufacturer){
        super(type);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }
}
