package View.Record;

import javax.swing.*;

public class DeleteRecordPanel extends JPanel {

    JTextField txt_del_record_id;
    JButton deleteRecordBtn;

    public DeleteRecordPanel()
    {

        txt_del_record_id = new JTextField();
        deleteRecordBtn = new JButton("Delete Record");

        txt_del_record_id.setText("txt_record_id");

        add(txt_del_record_id);
        add(deleteRecordBtn);
    }

    public JButton getDeleteRecordBtn() {
        return deleteRecordBtn;
    }

    public JTextField getTxt_del_record_id() {
        return txt_del_record_id;
    }

    public void setDeleteRecordBtn(JButton deleteRecordBtn) {
        this.deleteRecordBtn = deleteRecordBtn;
    }

    public void setTxt_del_record_id(JTextField txt_del_record_id) {
        this.txt_del_record_id = txt_del_record_id;
    }
}
