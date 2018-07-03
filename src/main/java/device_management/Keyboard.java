package device_management;

import Behaviours.IInput;

public class Keyboard extends InputDevice implements IInput {

    private String manufacturer;

    public Keyboard(String type, String manufacturer){
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
