package Composition.HomeTheater;

public class MediaPlayer {
    private boolean playing;

    public void play(String mediaTitle) {
        playing = true;
        System.out.println("Playing: " + mediaTitle);
    }

    public void stop() {
        if (playing) {
            playing = false;
            System.out.println("Media stopped");
        } else {
            System.out.println("No media is playing");
        }
    }

    public boolean isPlaying() { return playing; }
}