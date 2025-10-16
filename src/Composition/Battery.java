package Composition;

public class Battery extends Product{

    private int capacity;
    private int chargeLevel;

    public Battery(String model, String manufacturer, int capacity, int initialCharge) {
        super(model, manufacturer);
        this.capacity = capacity;
        this.chargeLevel = Math.max(0, Math.min(100, initialCharge)); // (19) clamp 0-100
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void drain(int percent) {
        if (percent < 0) return; // (22) ignore invalid
        chargeLevel = Math.max(0, chargeLevel - percent); // (23)
        System.out.println("Battery drained by " + percent + "%");
    }

    public void charge(int percent) {
        if (percent < 0) return;
        chargeLevel = Math.min(100, chargeLevel + percent);
        System.out.println("Battery charged by " + percent + "%");
    }

    public int getCapacity() { return capacity; }
}