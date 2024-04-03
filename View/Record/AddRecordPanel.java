package View.Record;

import javax.swing.*;

public class AddRecordPanel extends JPanel {

    JTextField txt_record_steps;
    JTextField txt_record_sleephrs;
    JTextField txt_record_hydration;
    JTextField txt_record_meditation;
    JButton addRecordBtn;

    public AddRecordPanel()
    {

        txt_record_steps = new JTextField();
        txt_record_sleephrs = new JTextField();
        txt_record_hydration = new JTextField();
        txt_record_meditation = new JTextField();
        addRecordBtn = new JButton("Add Record");


        txt_record_steps.setText("txt_record_steps");
        txt_record_sleephrs.setText("txt_record_sleephrs");
        txt_record_hydration.setText("txt_record_hydration");
        txt_record_meditation.setText("txt_record_meditation");

        add(txt_record_steps);
        add(txt_record_sleephrs);
        add(txt_record_hydration);
        add(txt_record_meditation);
        add(addRecordBtn);
    }

    public JTextField getTxt_record_steps() {
        return txt_record_steps;
    }

    public JTextField getTxt_record_sleephrs() {
        return txt_record_sleephrs;
    }

    public JTextField getTxt_record_hydration() {
        return txt_record_hydration;
    }

    public JTextField getTxt_record_meditation() {
        return txt_record_meditation;
    }

    public JButton getAddRecordBtn() {
        return addRecordBtn;
    }

    public void setTxt_record_steps(JTextField txt_record_steps) {
        this.txt_record_steps = txt_record_steps;
    }

    public void setTxt_record_sleephrs(JTextField txt_record_sleephrs) {
        this.txt_record_sleephrs = txt_record_sleephrs;
    }

    public void setTxt_record_hydration(JTextField txt_record_hydration) {
        this.txt_record_hydration = txt_record_hydration;
    }

    public void setTxt_record_meditation(JTextField txt_record_meditation) {
        this.txt_record_meditation = txt_record_meditation;
    }

    public void setAddRecordBtn(JButton addRecordBtn) {
        this.addRecordBtn = addRecordBtn;
    }
}
