package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();
    public void addTransport(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в техобслуживании");
        } else {
            transportQueue.add(transport);
        }
    }

    public void runTO() {
        Transport transport = transportQueue.poll();
        if (transport != null) {
            transport.getMechanic().get(0).runTO();
        }
    }
}
