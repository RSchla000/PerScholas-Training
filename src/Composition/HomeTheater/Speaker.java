package Composition.HomeTheater;

public class Speaker {
    private final String id;
    private boolean connected;

    public Speaker(String id, boolean connected) {
        this.id = id;
        this.connected = connected;
    }

    public String getId() { return id; }
    public boolean isConnected() { return connected; }

    public void connect() { connected = true; System.out.println("Speaker " + id + " connected"); }
    public void disconnect() { connected = false; System.out.println("Speaker " + id + " disconnected"); }
}