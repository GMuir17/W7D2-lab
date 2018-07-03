package device_management;

import Behaviours.IInput;

public class Mouse extends InputDevice implements IInput {

    private String manufacturer;

    public Mouse(String type, String manufacturer){
        super(type);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String sendData(String data){
        return data;
    }
}
