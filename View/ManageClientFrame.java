package View;

import javax.swing.*;

public class ManageClientFrame extends JFrame {
    InitialPanelClient ip;

    public ManageClientFrame() {
        super("Manage Client Dashboard");
        ip = new InitialPanelClient();
        add(ip);
        pack();
        setSize(500, 600);
    }

    public void setIp(InitialPanelClient ip) {
        this.ip = ip;
    }

    public InitialPanelClient getIp() {
        return ip;
    }
}
