package View;

import javax.swing.*;
import java.awt.*;

public class FirstFrame extends JFrame {
    JButton manageClientBtn;
    JButton manageRecordBtn;
    JButton manageEnrollmentBtn;
    JPanel firstPanel;

    public FirstFrame() {
        super("Main Dashboard");
        manageClientBtn = new JButton("Manage Client");
        manageRecordBtn = new JButton("Manage Record");
        manageEnrollmentBtn = new JButton("Manage Enrollment");

        firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(3, 1, 20, 20));
        firstPanel.add(manageClientBtn);
        firstPanel.add(manageRecordBtn);
        firstPanel.add(manageEnrollmentBtn);

        add(firstPanel);

        pack();
        setSize(500, 600);
        setVisible(true);
    }

    public void setFirstPanel(JPanel firstPanel) {
        this.firstPanel = firstPanel;
    }

    public void setManageClientBtn(JButton manageClientBtn) {
        this.manageClientBtn = manageClientBtn;
    }

    public void setManageRecordBtn(JButton manageRecordBtn) {
        this.manageRecordBtn = manageRecordBtn;
    }

    public void setManageEnrollmentBtn(JButton manageEnrollmentBtn) {
        this.manageEnrollmentBtn = manageEnrollmentBtn;
    }

    public JPanel getFirstPanel() {
        return firstPanel;
    }

    public JButton getManageClientBtn() {
        return manageClientBtn;
    }

    public JButton getManageRecordBtn() {
        return manageRecordBtn;
    }

    public JButton getManageEnrollmentBtn() {
        return manageEnrollmentBtn;
    }
}
