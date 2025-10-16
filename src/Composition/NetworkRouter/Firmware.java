package Composition.NetworkRouter;

public class Firmware {
    private String version;

    public Firmware(String version) {
        this.version = version;
    }

    public String getVersion() { return version; }

    public void upgradeTo(String newVersion) {
        if (newVersion == null || newVersion.isEmpty()) return;
        System.out.println("Upgrading firmware from " + version + " to " + newVersion);
        this.version = newVersion;
    }
}