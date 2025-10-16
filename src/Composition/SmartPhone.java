package Composition;

public class SmartPhone extends Product{
    private Screen screen;
    private Battery battery;
    private Processor processor;


    public SmartPhone(String model, String manufacturer,
                      Screen screen, Battery battery, Processor processor) {
        super(model, manufacturer);
        this.screen = screen;
        this.battery = battery;
        this.processor = processor;
    }


    public Screen getScreen() { return screen; }
    public Battery getBattery() { return battery; }
    public Processor getProcessor() { return processor; }
}