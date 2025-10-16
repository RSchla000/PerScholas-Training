package Composition.HomeTheater;

public class Projector {
    private boolean on;
    public void turnOn(){ on = true; System.out.println("Projector turned on");}
    public void turnOff(){ on = false; System.out.println("Projector turned off");}
    public boolean isOn() {return on;}
}
