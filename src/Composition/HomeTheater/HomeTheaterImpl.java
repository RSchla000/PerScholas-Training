package Composition.HomeTheater;

public class HomeTheaterImpl {
        public static void main(String[] args) {
            Amplifier amp = new Amplifier(30);
            Projector pj = new Projector();
            Speaker[] speakers = {
                    new Speaker("Front-Left", true),
                    new Speaker("Front-Right", true),
                    new Speaker("Rear-Left", false),
                    new Speaker("Rear-Right", false)
            };
            MediaPlayer player = new MediaPlayer();

            HomeTheater ht = new HomeTheater("CineMax", "Sony", amp, pj, speakers, player);


            System.out.println("HomeTheater Model: " + ht.getModel());
            ht.listSpeakers();
            ht.powerOn();
            ht.playMedia("Inception (1080p)");
            ht.setVolume(55);
            ht.listSpeakers();


            speakers[2].connect();
            speakers[3].connect();
            ht.listSpeakers();


            ht.powerOff();
        }
    }