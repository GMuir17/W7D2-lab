import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;
    Speaker speaker;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        Mouse mouse = new Mouse("Field", "Panasonic");
        computer = new Computer(8, 512, monitor, mouse);
        Speaker speaker = new Speaker(100);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasInputDevice() {
       assertNotNull(computer.getInputDevice());
    }

    @Test
    public void hasOutputDevice() {
        assertNotNull(computer.getOutputDevice());
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: holiday pictures", computer.outputData("holiday pictures"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
        public void canSendDataViaMouse(){
        Mouse mouse = new Mouse("Field", "Panasonic");
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("Transmitting mousing data", computer.inputData("Transmitting mousing data"));
    }

    @Test
    public void canSendDataViaKeyboard(){
        Keyboard keyboard = new Keyboard("Corded", "Apple");
        computer = new Computer(8, 512, speaker, keyboard);
        assertEquals("Transmitting typing data", computer.inputData("Transmitting typing data"));
    }


    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: dissertation", computer.outputData("dissertation"));
    }

    @Test
    public void canSetDataStream() {
        computer.setDataStream("not null");
        assertEquals("not null", computer.getDataStream());
    }

    @Test
    public void canSetDataStreamViaInputData() {
        Keyboard keyboard = new Keyboard("Corded", "Apple");
        computer = new Computer(8, 512, speaker, keyboard);
        computer.inputData("not null");
        assertEquals("not null", computer.getDataStream());
    }

    @Test
    public void canGetOutputDataStream() {
        computer.inputData("hello");
        assertEquals("hello is now on screen", computer.outputDataStream());
    }




}
