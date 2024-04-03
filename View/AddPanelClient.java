package View;

import javax.swing.*;

public class AddPanelClient extends JPanel {
    JTextField txt_id;
    JTextField txt_email;
    JTextField txt_f_name;
    JTextField txt_f_age;
    JTextField txt_f_gender;
    JButton addClientBtn;

    public AddPanelClient()
    {
        txt_id = new JTextField();
        txt_email = new JTextField();
        txt_f_name = new JTextField();
        txt_f_age = new JTextField();
        txt_f_gender = new JTextField();
        addClientBtn = new JButton("Add Client");

        txt_id.setText("id");
        txt_email.setText("email");
        txt_f_name.setText("f_name");
        txt_f_age.setText("f_age");
        txt_f_gender.setText("f_gender");

        add(txt_id);
        add(txt_email);
        add(txt_f_name);
        add(txt_f_age);
        add(txt_f_gender);
        add(addClientBtn);
    }

    public JTextField getTxt_id() {
        return txt_id;
    }

    public JTextField getTxt_email() {
        return txt_email;
    }

    public JTextField getTxt_f_name() {
        return txt_f_name;
    }

    public JTextField getTxt_f_age() {
        return txt_f_age;
    }

    public JTextField getTxt_f_gender() {
        return txt_f_gender;
    }

    public JButton getAddClientBtn() {
        return addClientBtn;
    }
}
