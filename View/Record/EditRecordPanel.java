package View.Record;

import javax.swing.*;

public class EditRecordPanel extends JPanel {

    JTextField txt_get_record_idx;
    JButton getRecordBtn;
    JTextField txt_record_steps;
    JTextField txt_record_sleephrs;
    JTextField txt_record_hydration;
    JTextField txt_record_meditation;
    JButton editRecordBtn;

    public EditRecordPanel()
    {

        txt_record_steps = new JTextField();
        txt_record_sleephrs = new JTextField();
        txt_record_hydration = new JTextField();
        txt_record_meditation = new JTextField();
        editRecordBtn = new JButton("Edit Record");
        txt_get_record_idx = new JTextField();
        getRecordBtn = new JButton("Get Record to Edit");

        txt_record_steps.setText("txt_record_steps");
        txt_record_sleephrs.setText("txt_record_sleephrs");
        txt_record_hydration.setText("txt_record_hydration");
        txt_record_meditation.setText("txt_record_meditation");
        txt_get_record_idx.setText("get record id");

        add(txt_get_record_idx);
        add(getRecordBtn);

        add(txt_record_steps);
        add(txt_record_sleephrs);
        add(txt_record_hydration);
        add(txt_record_meditation);
        add(editRecordBtn);
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

    public JButton getEditRecordBtn() {
        return editRecordBtn;
    }

    public JTextField getTxt_get_record_idx() {
        return txt_get_record_idx;
    }
    public JButton getGetRecordBtn() {
        return getRecordBtn;
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

    public void setEditRecordBtn(JButton editRecordBtn) {
        this.editRecordBtn = editRecordBtn;
    }

    public void setTxt_get_record_idx(JTextField txt_get_record_idx) {
        this.txt_get_record_idx = txt_get_record_idx;
    }

    public void setGetRecordBtn(JButton getRecordBtn) {
        this.getRecordBtn = getRecordBtn;
    }
}
