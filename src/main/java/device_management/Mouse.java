package device_management;

public class Mouse extends InputDevice {

    private String manufacturer;

    public Mouse(String type, String manufacturer){
        super(type);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }
}
