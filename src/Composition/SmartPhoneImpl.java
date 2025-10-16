package Composition;

public class SmartPhoneImpl{
    public static void main(String[] args) { // (44)

        Screen screen = new Screen("S-AMOLED-1", "Samsung", "1080x2400", 6.5);
        Battery battery = new Battery("BAT-5000", "LG Chem", 5000, 85); // 85% initial
        Processor cpu = new Processor("Snapdragon-888", "Qualcomm", 8, 2.84);

        SmartPhone myPhone = new SmartPhone("GalaxyX", "Samsung", screen, battery, cpu);


        System.out.println("Phone Model: " + myPhone.getModel());
        System.out.println("Manufacturer: " + myPhone.getManufacturer());
        System.out.println("Screen: " + myPhone.getScreen().getResolution() +
                " (" + myPhone.getScreen().getSize() + " inches)");
        System.out.println("Battery: " + myPhone.getBattery().getCapacity() +
                "mAh, Charge: " + myPhone.getBattery().getChargeLevel() + "%");
        System.out.println("Processor: " + myPhone.getProcessor().getCores() +
                " cores @ " + myPhone.getProcessor().getFrequency() + " GHz");

        myPhone.getScreen().touchAt(150, 300);
        myPhone.getProcessor().runApp("YouTube", myPhone.getBattery());
        System.out.println("Battery after running app: " + myPhone.getBattery().getChargeLevel() + "%");

        myPhone.getBattery().charge(10);
        System.out.println("Battery after charging: " + myPhone.getBattery().getChargeLevel() + "%");
    }
}
