package Composition.HomeTheater;

public class HomeTheater extends Product {
    private Amplifier amplifier;   // (37)
    private Projector projector;   // (38)
    private Speaker[] speakers;    // (39)
    private MediaPlayer mediaPlayer; // (40)
    private boolean poweredOn;     // (41)

    public HomeTheater(String model, String manufacturer,
                       Amplifier amplifier, Projector projector,
                       Speaker[] speakers, MediaPlayer mediaPlayer) { // (42)
        super(model, manufacturer);
        this.amplifier = amplifier;
        this.projector = projector;
        this.speakers = speakers;
        this.mediaPlayer = mediaPlayer;
        this.poweredOn = false;
    }

    // (43) Power on sequence
    public void powerOn() {
        poweredOn = true;
        projector.turnOn();
        System.out.println("HomeTheater powered on");
    }

    // (44) Power off sequence
    public void powerOff() {
        mediaPlayer.stop();
        projector.turnOff();
        poweredOn = false;
        System.out.println("HomeTheater powered off");
    }

    // (45) Play media if powered on
    public void playMedia(String title) {
        if (!poweredOn) {
            System.out.println("Power on the system first");
            return;
        }
        mediaPlayer.play(title);
    }

    // (46) Adjust volume via amplifier
    public void setVolume(int level) {
        amplifier.setVolume(level);
    }

    // (47) List speaker connection statuses
    public void listSpeakers() {
        System.out.println("Speakers status:");
        for (Speaker s : speakers) {
            System.out.printf("  %s : %s%n", s.getId(), s.isConnected() ? "connected" : "disconnected");
        }
    }
}