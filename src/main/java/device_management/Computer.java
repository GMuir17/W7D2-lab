package device_management;

import Behaviours.IInput;
import Behaviours.IOutput;

public class Computer {
    private int ram;
    private int hddSize;
    private String dataStream;
    private IOutput outputDevice;
    private IInput inputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
        this.dataStream = null;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IInput getInputDevice() {
        return this.inputDevice;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public String inputData(String data) {
        setDataStream(data);
        return this.inputDevice.sendData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.outputDevice = outputDevice;
    }

    public void setDataStream(String data) {
        this.dataStream = data;
    }

    public String getDataStream() {
        return dataStream;
    }

    public String outputDataStream() {
        return this.outputDevice.outputData(dataStream);
    }

}
