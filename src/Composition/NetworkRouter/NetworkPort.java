package Composition.NetworkRouter;

public class NetworkPort {
    private final int id;
    private boolean enabled;

    public NetworkPort(int id, boolean enabled) {
        this.id = id;
        this.enabled = enabled;
    }
    public int getId() { return id; }
    public boolean isEnabled() { return enabled; }

    public void enable() {
        enabled = true;
        System.out.println("Port " + id + " enabled");
    }
    public void disable() {
        enabled = false;
        System.out.println("Port " + id + " disabled");
    }
}