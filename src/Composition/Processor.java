package Composition;

public class Processor extends Product{
    private int cores;
    private double frequency;

    public Processor(String model, String manufacturer, int cores, double frequency) {
        super(model, manufacturer);
        this.cores = cores;
        this.frequency = frequency;
    }

    public void runApp(String appName, Battery battery) {
        System.out.println("Processor running app: " + appName);

        if (battery != null) {
            int drainAmount = Math.max(1, (int)Math.round(frequency * cores)); // (33)
            battery.drain(drainAmount);
        }
    }

    public int getCores() { return cores; }
    public double getFrequency() { return frequency; }
}