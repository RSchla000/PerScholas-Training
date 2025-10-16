package Composition.HomeTheater;

public class Amplifier {
    private int volume;
    public Amplifier(int initialVolume){
        this.volume = Math.max(0, Math.min(100, initialVolume));
    }
    public void setVolume(int volume){
        this.volume = Math.max(0,Math.min(100, volume));
        System.out.println("Amplifier volume set to" +this.volume);
    }
    public int getVolume() {return volume;}
}
