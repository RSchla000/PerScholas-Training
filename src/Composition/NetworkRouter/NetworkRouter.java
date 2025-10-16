package Composition.NetworkRouter;

public class NetworkRouter extends Product {
    private NetworkPort[] ports;
    private Firmware firmware;

    public NetworkRouter(String model, String manufacturer, NetworkPort[] ports, Firmware firmware) { // (27)
        super(model, manufacturer);
        this.ports = ports;
        this.firmware = firmware;
    }
    public void enablePort(int id) {
        for (NetworkPort p : ports) {
            if (p.getId() == id) { p.enable(); return; }
        }
        System.out.println("Port " + id + " not found");
    }
    public void disablePort(int id) {
        for (NetworkPort p : ports) {
            if (p.getId() == id) { p.disable(); return; }
        }
        System.out.println("Port " + id + " not found");
    }
    public void listEnabledPorts() {
        System.out.print("Enabled ports: ");
        boolean any = false;
        for (NetworkPort p : ports) {
            if (p.isEnabled()) {
                System.out.print(p.getId() + " ");
                any = true;
            }
        }
        if (!any) System.out.print("none");
        System.out.println();
    }
    public void upgradeFirmware(String newVersion) {
        firmware.upgradeTo(newVersion);
    }

    public String getFirmwareVersion() { return firmware.getVersion(); } // (32)
}