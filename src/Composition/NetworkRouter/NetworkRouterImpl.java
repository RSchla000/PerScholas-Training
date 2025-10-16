package Composition.NetworkRouter;

public class NetworkRouterImpl {
    public static void main(String[] args) { // (35)
        NetworkPort[] ports = {
                new NetworkPort(1, true),
                new NetworkPort(2, false),
                new NetworkPort(3, false),
                new NetworkPort(4, true)
        };

        Firmware fw = new Firmware("1.0.0");

        NetworkRouter router = new NetworkRouter("EdgeRouterX", "Ubiquiti", ports, fw);

        System.out.println("Router Model: " + router.getModel());
        System.out.println("Firmware: " + router.getFirmwareVersion());
        router.listEnabledPorts();

        router.enablePort(3);
        router.disablePort(1);
        router.listEnabledPorts();

        router.upgradeFirmware("1.1.0");
        System.out.println("Firmware after upgrade: " + router.getFirmwareVersion());
    }
}
